package com.example.whatsapp.model;

import com.example.whatsapp.enums.ChatType;
import com.example.whatsapp.enums.ContentType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SendMessageDTO {
    private String chatId;
    @NonNull
    private Long senderId;
    @NonNull
    private List<Long> receiverIds; //why list because it will be used for both use cases for group and individual
    @NonNull
    private String content;
    @NonNull
    private ContentType contentType;
//    private String groupId;
//    private ChatType chatType;
}
