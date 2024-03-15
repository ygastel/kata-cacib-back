package fr.cacib.kata.service;

import fr.cacib.kata.persistence.entity.MessageEntity;
import fr.cacib.kata.persistence.repository.MessageEntityRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

import java.time.ZonedDateTime;

@Service
@RequiredArgsConstructor
@Slf4j
public class MessageReceiver {

    private final MessageEntityRepository messageEntityRepository;

    @JmsListener(destination = "DEV.QUEUE.1")
    public void receiveMessage(String message) {
        log.info("New message receive from queue: {}", message);
        MessageEntity messageEntity = MessageEntity.builder()
                .messageContent(message)
                .creationDateTime(ZonedDateTime.now())
                .build();
        messageEntityRepository.save(messageEntity);
    }

}
