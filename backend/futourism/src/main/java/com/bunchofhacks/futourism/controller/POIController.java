package com.bunchofhacks.futourism.controller;

import com.bunchofhacks.futourism.model.Result;
import com.bunchofhacks.futourism.output.POIOutput;
import com.bunchofhacks.futourism.parser.POIOutputParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class POIController {

  @Autowired private ApplicationContext applicationContext;

  @GetMapping(path = "/scenario1", produces = MediaType.APPLICATION_JSON_VALUE)
  @CrossOrigin(origins = "http://bunchofhacks.xxxl-dev.at")
  String respondToScenario1() {

    ObjectMapper mapper = new ObjectMapper();

    Result eventEn = applicationContext.getBean(POIDataProvider.class).getEventEn();
    Result gastroEn = applicationContext.getBean(POIDataProvider.class).getGastroEn();
    Result hotelEn = applicationContext.getBean(POIDataProvider.class).getHotelEn();
    Result poiEn = applicationContext.getBean(POIDataProvider.class).getPOIEn();
    Result tourEn = applicationContext.getBean(POIDataProvider.class).getTourEn();

    List<POIOutput> eventEnList = new ArrayList();

    for (int i = 0; i <= 30; i++) {
      eventEnList.add(POIOutputParser.map(eventEn.getItems()[i]));
    }

    List<POIOutput> gastroEnList = new ArrayList();

    for (int i = 0; i <= 30; i++) {
      gastroEnList.add(POIOutputParser.map(gastroEn.getItems()[i]));
    }

    List<POIOutput> hotelEnList = new ArrayList();

    for (int i = 0; i <= 30; i++) {
      hotelEnList.add(POIOutputParser.map(hotelEn.getItems()[i]));
    }

    List<POIOutput> poiEnList = new ArrayList();

    for (int i = 0; i <= 30; i++) {
      poiEnList.add(POIOutputParser.map(poiEn.getItems()[i]));
    }

    List<POIOutput> tourEnList = new ArrayList();

    for (int i = 0; i <= 30; i++) {
      tourEnList.add(POIOutputParser.map(tourEn.getItems()[i + 10]));
    }

    Map<String, List<POIOutput>> outStringListMap = new HashMap<>();

    outStringListMap.put("event", eventEnList);
    outStringListMap.put("gastro", gastroEnList);
    outStringListMap.put("hotel", hotelEnList);
    outStringListMap.put("poi", poiEnList);
    outStringListMap.put("tour", tourEnList);

    try {
      return mapper.writeValueAsString(outStringListMap);
    } catch (JsonProcessingException e) {
      e.printStackTrace();
    }
    return "Error";
  }
}
