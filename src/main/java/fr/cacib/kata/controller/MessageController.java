package fr.cacib.kata.controller;

import fr.cacib.kata.persistence.entity.MessageEntity;
import fr.cacib.kata.persistence.repository.MessageEntityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("message")
@RequiredArgsConstructor
@CrossOrigin
public class MessageController {

    private final MessageEntityRepository messageEntityRepository;

    @GetMapping
    List<MessageEntity> getMessages() {
        return messageEntityRepository.findAll();
    }

}
