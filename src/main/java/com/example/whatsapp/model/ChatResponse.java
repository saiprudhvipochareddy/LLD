package com.example.whatsapp.model;

import com.example.whatsapp.entity.Message;
import com.example.whatsapp.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ChatResponse {
    private String chatId;
    private List<User> normalUsers;
    private List<User> adminUsers;
    private List<Message> messages;
}
