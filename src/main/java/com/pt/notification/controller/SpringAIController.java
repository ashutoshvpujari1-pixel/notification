package com.pt.notification.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;


import org.springframework.ai.chat.client.ChatClient;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/ai")
@CrossOrigin(origins = "*")
public class SpringAIController {

	static Logger logger = LoggerFactory.getLogger(SpringAIController.class);
	
    private ChatClient chatClient = null;

    public SpringAIController(ChatClient.Builder chatClientBuilder) {
        this.chatClient = chatClientBuilder.build();
    }

    @GetMapping("/chat")
    public String ask() {

    	logger.info("ask method started..");
    	
        return chatClient
                .prompt()
                .user("what is spring boot")
                .call()
                .content();
    }
}