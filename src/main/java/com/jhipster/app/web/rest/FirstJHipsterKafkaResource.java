package com.jhipster.app.web.rest;

import com.jhipster.app.service.FirstJHipsterKafkaProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/first-j-hipster-kafka")
public class FirstJHipsterKafkaResource {

    private final Logger log = LoggerFactory.getLogger(FirstJHipsterKafkaResource.class);

    private FirstJHipsterKafkaProducer kafkaProducer;

    public FirstJHipsterKafkaResource(FirstJHipsterKafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @PostMapping(value = "/publish")
    public void sendMessageToKafkaTopic(@RequestParam("message") String message) {
        log.debug("REST request to send to Kafka topic the message : {}", message);
        this.kafkaProducer.sendMessage(message);
    }
}
