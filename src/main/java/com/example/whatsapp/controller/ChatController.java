package com.example.whatsapp.controller;

import com.example.whatsapp.model.Chat;
import com.example.whatsapp.service.ChatService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chat")
public class ChatController {
    private final ChatService chatService;

    public ChatController(ChatService chatService) {
        this.chatService = chatService;
    }

    @GetMapping
    public Chat getChatById(@RequestParam String chatId) {
        return chatService.getChatByChatId(chatId);
    }
}
