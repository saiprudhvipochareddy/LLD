package com.example.whatsapp.controller;

import com.example.whatsapp.model.SendMessageDTO;
import com.example.whatsapp.service.ChatService;
import com.example.whatsapp.service.MessageService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class MessageController {
    private final MessageService messageService;

    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @PostMapping
    public void sendMessage(@RequestBody @Validated SendMessageDTO sendMessageDTO) {
        messageService.sendMessage(sendMessageDTO);
    }
}
