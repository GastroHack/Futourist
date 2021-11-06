package com.bunchofhacks.futourism.controller;

import com.bunchofhacks.futourism.model.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class POIController {

  @Autowired
  private ApplicationContext applicationContext;

  @GetMapping("/scenario1")
  @CrossOrigin(origins = "http://bunchofhacks.xxxl-dev.at")
  String respondToScenario1() {
    Result eventDe = applicationContext.getBean(POIDataProvider.class).getEventEn();
    System.out.println(eventDe);
    return "hello world";
  }
}
