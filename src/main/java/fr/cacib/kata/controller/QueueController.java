package fr.cacib.kata.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("queue")
@RequiredArgsConstructor
@CrossOrigin
public class QueueController {

    private final JmsTemplate jmsTemplate;

    @PostMapping("send")
    void postMessage(@RequestBody String messageContent) {
        jmsTemplate.convertAndSend("DEV.QUEUE.1", messageContent);
    }

}
