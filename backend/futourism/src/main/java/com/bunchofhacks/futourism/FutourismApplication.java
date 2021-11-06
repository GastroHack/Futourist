package com.bunchofhacks.futourism;

import com.bunchofhacks.futourism.controller.POIDataProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FutourismApplication {

  public static void main(String[] args) {
    SpringApplication.run(FutourismApplication.class, args);
    POIDataProvider poiDataProvider = new POIDataProvider();
  }
}
