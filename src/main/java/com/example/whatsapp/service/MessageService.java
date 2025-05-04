package com.example.whatsapp.service;

import com.example.whatsapp.entity.Message;
import com.example.whatsapp.enums.ChatType;
import com.example.whatsapp.enums.ContentType;
import com.example.whatsapp.model.Chat;
import com.example.whatsapp.model.SendMessageDTO;
import com.example.whatsapp.repository.MessageRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {
    private final MessageRepository messageRepository;
    private final NotificationService notificationService;
    private final ChatService chatService;

    public MessageService(MessageRepository messageRepository, NotificationService notificationService, ChatService chatService) {
        this.messageRepository = messageRepository;
        this.notificationService = notificationService;
        this.chatService = chatService;
    }

    public void sendMessage(SendMessageDTO sendMessageDTO) {
        Message message = Message.builder()
                .senderId(sendMessageDTO.getSenderId())
                .receiverIds(sendMessageDTO.getReceiverIds())
                .content(sendMessageDTO.getContent())
                .contentType(sendMessageDTO.getContentType())
                .build();
        if (sendMessageDTO.getChatType().equals(ChatType.GROUP_CHAT)) {

        } else {

        }
        message = messageRepository.save(message);
        chatService.addMessage(sendMessageDTO.getChatId(), List.of(message));
        notificationService.notifyUser(sendMessageDTO.getReceiverIds(), sendMessageDTO.getContent());
    }
}
