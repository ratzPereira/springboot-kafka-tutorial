package com.ratz.springbootkafkatutorial.controller;

import com.ratz.springbootkafkatutorial.DTO.User;
import com.ratz.springbootkafkatutorial.producer.JsonKafkaProducer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/kafka")
public class JsonMessageController {

  private JsonKafkaProducer jsonKafkaProducer;

  public JsonMessageController(JsonKafkaProducer jsonKafkaProducer) {
    this.jsonKafkaProducer = jsonKafkaProducer;
  }

  @PostMapping("/publish")
  public ResponseEntity<String> publishMessage(@RequestBody User user){

    jsonKafkaProducer.sendMessage(user);
    return ResponseEntity.ok("Json message sent!");
  }
}
