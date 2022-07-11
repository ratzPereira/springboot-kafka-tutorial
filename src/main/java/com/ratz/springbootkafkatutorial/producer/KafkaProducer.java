package com.ratz.springbootkafkatutorial.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

  private static final Logger LOGGER = LoggerFactory.getLogger(KafkaProducer.class.getSimpleName());

  private KafkaTemplate<String,String> kafkaTemplate;

  public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
    this.kafkaTemplate = kafkaTemplate;
  }


  public void sendMessage(String message){

    LOGGER.info("Message from producer: " + message);
    kafkaTemplate.send("myfirsttopoc", message);
  }
}