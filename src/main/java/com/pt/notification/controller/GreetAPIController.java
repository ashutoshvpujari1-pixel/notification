package com.pt.notification.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pt.notification.NotificationApplication;

@RestController
public class GreetAPIController {
	
	static Logger logger = LoggerFactory.getLogger(NotificationApplication.class);

    @GetMapping("/greet")
    public String sayGoodMorning(@RequestParam(value = "name", defaultValue = "Ashutosh") String name) {
    	logger.info("sayGoodMorning method started..");
        return String.format("Good Morning %s", name);
    }
}
