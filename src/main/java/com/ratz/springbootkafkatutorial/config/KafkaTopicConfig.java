package com.ratz.springbootkafkatutorial.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

  @Bean
  public NewTopic myFirstTopic(){

    return TopicBuilder.name("myfirsttopic").build();
  }

  @Bean
  public NewTopic myFirstJsonTopic(){

    return TopicBuilder.name("jsonTopic").build();
  }
}
