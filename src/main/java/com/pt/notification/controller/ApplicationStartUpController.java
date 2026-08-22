package com.pt.notification.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.pt.notification.NotificationApplication;

@Component
public class ApplicationStartUpController implements CommandLineRunner {
	
	static Logger logger = LoggerFactory.getLogger(NotificationApplication.class);

    @Override
    public void run(String... args) {
    	logger.info("Application initialization Started..");
    	logger.info("In this class and method, you can implement all startup related functionalities..");
    	logger.info("Application initialization Ended..");
    }
}