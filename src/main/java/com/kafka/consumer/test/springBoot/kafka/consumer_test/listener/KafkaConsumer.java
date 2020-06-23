package com.kafka.consumer.test.springBoot.kafka.consumer_test.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "Kafka_Example")
    public void consume(String message) {
        System.out.println("Consumed message: " +message);
    }
}
