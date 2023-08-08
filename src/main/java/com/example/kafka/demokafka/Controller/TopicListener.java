package com.example.kafka.demokafka.Controller;


import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class TopicListener {

    @Value("${topic.name.producer}")
    private String topicName;

    @KafkaListener(topics = "${topic.name.producer}", groupId = "group_id")
    public void consume(ConsumerRecord<String, String> payload) {
        System.out.println("Topic name: {}-----?"+ topicName);
        System.out.println("Value received: {}----->"+ payload.value());

    }
}
