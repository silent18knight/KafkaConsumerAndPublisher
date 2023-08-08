package com.example.kafka.demokafka.Controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/kafka")

public class ProducerController {

    private final TopicProducer topicProducer;

    public ProducerController(TopicProducer topicProducer) {
        this.topicProducer = topicProducer;
    }

    @PostMapping(value = "/send")
    public void send(@RequestBody String message){
        topicProducer.send(message);
    }
}
