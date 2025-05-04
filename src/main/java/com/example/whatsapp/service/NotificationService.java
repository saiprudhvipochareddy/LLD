package com.example.whatsapp.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationService {
    //Implement proper observer pattern here
    public void notifyUser(List<Long> userIds, String message) {
        userIds.forEach(userId ->
                System.out.println("Notifying use: " + userId + " with message " + message));
        ;
    }
}
