package com.bunchofhacks.futourism.controller;

import com.bunchofhacks.futourism.model.Item;
import com.bunchofhacks.futourism.output.POIOutput;
import com.bunchofhacks.futourism.parser.POIOutputMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class POIController {

  private static final String errorResponse = "No data available.";

  @Autowired private ApplicationContext applicationContext;

  @GetMapping(path = "/scenario1", produces = MediaType.APPLICATION_JSON_VALUE)
  String respondToScenario1() {

    ObjectMapper mapper = new ObjectMapper();

    List<List<Item>> outputList =
        applicationContext
            .getBean(POIDataProvider.class)
            .getItemsbyIds(
                "4c4af4ea-91a1-4775-bc7e-0635ad35b0da",
                "1543262",
                "39faef1a-f332-4851-b20f-0ddf0fcd315b",
                "ba19b2c6-da84-4406-a2aa-0f9f2cb6b5d0",
                "b9950494-472f-4a97-b9b9-15b33d985503\n");

    List<List<POIOutput>> completeOutputList = new ArrayList<>();

    mapOutputList(outputList, completeOutputList);

    try {
      return mapper.writeValueAsString(completeOutputList);
    } catch (JsonProcessingException e) {
      e.printStackTrace();
    }
    return errorResponse;
  }

  @GetMapping(path = "/scenario2", produces = MediaType.APPLICATION_JSON_VALUE)
  String respondToScenario2() {

    ObjectMapper mapper = new ObjectMapper();

    List<List<Item>> outputList =
        applicationContext
            .getBean(POIDataProvider.class)
            .getItemsbyIds(
                "5d3ab5a5-a5eb-489e-ab2b-0833ec3e8008",
                "eeadc12d-9a3c-45be-a4e7-0938c133f5e1",
                "91139584-d020-440b-8116-126370d548ad",
                "0db96cb7-ff51-45df-a644-1b3f12ef589c\n");

    List<List<POIOutput>> completeOutputList = new ArrayList<>();

    mapOutputList(outputList, completeOutputList);

    try {
      return mapper.writeValueAsString(completeOutputList);
    } catch (JsonProcessingException e) {
      e.printStackTrace();
    }
    return errorResponse;
  }

  @GetMapping(path = "/scenario3", produces = MediaType.APPLICATION_JSON_VALUE)
  String respondToScenario3() {

    ObjectMapper mapper = new ObjectMapper();

    List<List<Item>> outputList =
        applicationContext
            .getBean(POIDataProvider.class)
            .getItemsbyIds(
                "6fbb10c6-53fe-4b90-9a09-1061f1a73ada",
                "a5896801-537a-43fb-bbfd-013d05b1e451",
                "422311a7-a239-4ccd-a4d2-0bdcead9f91d",
                "ecb7da25-c535-41a2-accf-da07b16149ec\n");

    List<List<POIOutput>> completeOutputList = new ArrayList<>();

    mapOutputList(outputList, completeOutputList);

    try {
      return mapper.writeValueAsString(completeOutputList);
    } catch (JsonProcessingException e) {
      e.printStackTrace();
    }
    return errorResponse;
  }

  @GetMapping(path = "/scenario4", produces = MediaType.APPLICATION_JSON_VALUE)
  String respondToScenario4() {

    ObjectMapper mapper = new ObjectMapper();

    List<List<Item>> outputList =
        applicationContext
            .getBean(POIDataProvider.class)
            .getItemsbyIds(
                "1ccabb8c-574b-44f0-8fb7-30fee98d8eef",
                "1ced8a81-d613-4fc8-9180-046e6462e398",
                "9661c65a-950b-4e9f-88f8-83d607f81e40",
                "f2834416-584d-4224-869e-9f15d7fc73fa\n");

    List<List<POIOutput>> completeOutputList = new ArrayList<>();

    mapOutputList(outputList, completeOutputList);

    try {
      return mapper.writeValueAsString(completeOutputList);
    } catch (JsonProcessingException e) {
      e.printStackTrace();
    }
    return errorResponse;
  }

  private void mapOutputList(
      List<List<Item>> outputList, List<List<POIOutput>> completeOutputList) {
    for (List<Item> itemList : outputList) {
      List<POIOutput> poiOutputList = new ArrayList<>();

      for (Item singleItem : itemList) {
        poiOutputList.add(POIOutputMapper.map(singleItem));
      }

      completeOutputList.add(poiOutputList);
    }
  }
}
