package com.bunchofhacks.futourism.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class POIController {

  @GetMapping("/scenario1")
  @CrossOrigin(origins = "http://bunchofhacks.xxxl-dev.at")
  String respondToScenario1() {
    return "hello world";
  }

}
