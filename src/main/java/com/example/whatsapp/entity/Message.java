package com.example.whatsapp.entity;

import com.example.whatsapp.enums.ContentType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String messageId;
    private Long senderId;
    private List<Long> receiverIds;
    private String content;
    private ContentType contentType;
    @CreatedDate
    private LocalDateTime localDateTime;
}
