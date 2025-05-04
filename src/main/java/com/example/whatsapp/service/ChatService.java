package com.example.whatsapp.service;

import com.example.whatsapp.entity.Message;
import com.example.whatsapp.model.Chat;
import com.example.whatsapp.model.SendMessageDTO;
import com.example.whatsapp.repository.MessageRepository;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class ChatService {
    //Here maintaining the in memory database
    private Map<String, Chat> chatDetails = new HashMap<>();

    public Chat createChat(Chat chatRequest) {
        String chatId = UUID.randomUUID().toString();
        Chat chatFinal = Chat.builder()
                .chatId(chatId)
                .adminUsers(chatRequest.getAdminUsers())
                .normalUsers(chatRequest.getNormalUsers())
                .messages(chatRequest.getMessages())
                .groupId(chatRequest.getGroupId())
                .chatType(chatRequest.getChatType())
                .build();
        chatDetails.put(chatId, chatFinal);

        return chatFinal;
    }

    public void addMessage(String chatId, List<Message> messageList) {
        chatDetails.get(chatId).getMessages().addAll(messageList);
    }

    public Chat getChatByChatId(String chatId) {
        return chatDetails.get(chatId);
    }

}
