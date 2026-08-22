package com.pt.notification.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pt.notification.NotificationApplication;

@RestController
public class ApplicationVersionController {
	
	static Logger logger = LoggerFactory.getLogger(NotificationApplication.class);

	@Value("${info.app.version}")
	private String applicationVersion;

	@Value("${info.app.name}")
	private String applicationName;
	
    @GetMapping("/applicationversion")
    public String returnApplicationVersion() {
    	logger.info("returnApplicationVersion method started..");
        return applicationVersion;
    }
    
    @GetMapping("/applicationname")
    public String returnApplicationName() {
    	logger.info("returnApplicationName method started..");
        return applicationName;
    }   
    
}
