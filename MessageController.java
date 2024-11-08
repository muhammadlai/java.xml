package com.example.messagesender.controller;

import com.example.messagesender.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/messages")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @PostMapping("/send")
    public String sendMessages(@RequestParam String threadId,
                                @RequestParam String hatersName,
                                @RequestParam int time) {
        return messageService.sendMessages(threadId, hatersName, time);
    }

    @PostMapping("/stop")
    public String stopMessages(@RequestParam String threadId) {
        return messageService.stopMessages(threadId);
    }
}
