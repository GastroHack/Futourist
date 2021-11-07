package com.bunchofhacks.futourism.controller;

import com.bunchofhacks.futourism.model.Item;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class POIController {

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

    try {
      return mapper.writeValueAsString(outputList);
    } catch (JsonProcessingException e) {
      e.printStackTrace();
    }
    return "Error";
  }
}
