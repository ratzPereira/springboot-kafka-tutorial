package com.ratz.springbootkafkatutorial.consumer;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

  private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class.getSimpleName());

  @KafkaListener(topics = "myfirsttopoc", groupId = "myGroup")
  public void consume(String message){

    LOGGER.info("Consumed the message: " + message);
  }
}
