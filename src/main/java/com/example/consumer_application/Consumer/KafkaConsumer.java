package com.example.consumer_application.Consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {
    
    @KafkaListener(topics = "${kafka.topic}")
    public void consumeMEssage(Message<String> message) {
        System.out.println("Consumed message: " + message.getPayload());
    }
}
