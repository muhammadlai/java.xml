package com.example.messagesender.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class MessageService {
    private final Map<String, String> conversations = new HashMap<>();

    public String sendMessages(String threadId, String hatersName, int time) {
        // Logic to send messages
        conversations.put(threadId, "Message sending started!");
        return "Sending messages to " + threadId + " from " + hatersName + " every " + time + " seconds.";
    }

    public String stopMessages(String threadId) {
        if (conversations.containsKey(threadId)) {
            conversations.remove(threadId);
            return "Stopped messages for " + threadId;
        } else {
            return "No messages to stop for " + threadId;
        }
    }
}
