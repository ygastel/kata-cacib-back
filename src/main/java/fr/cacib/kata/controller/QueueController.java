package fr.cacib.kata.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("queue")
@RequiredArgsConstructor
public class QueueController {

    private final JmsTemplate jmsTemplate;

    @PostMapping("send")
    void postMessage() {
        jmsTemplate.convertAndSend("DEV.QUEUE.1", "Hello world");
    }

}
