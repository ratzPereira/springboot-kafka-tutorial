package com.ratz.springbootkafkatutorial.consumer;

import com.ratz.springbootkafkatutorial.DTO.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {

  private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class.getSimpleName());

  @KafkaListener(topics = "jsonTopic")
  public void consume(User user){

    LOGGER.info("Consumed the message: " + user.toString());
  }
}
