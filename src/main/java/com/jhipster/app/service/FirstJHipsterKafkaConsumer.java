package com.jhipster.app.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class FirstJHipsterKafkaConsumer {

    private final Logger log = LoggerFactory.getLogger(FirstJHipsterKafkaConsumer.class);
    private static final String TOPIC = "topic_first_jhipster";

    @KafkaListener(topics = "topic_first_jhipster", groupId = "group_id")
    public void consume(String message) throws IOException {
        log.info("Consumed message in {} : {}", TOPIC, message);
    }
}
