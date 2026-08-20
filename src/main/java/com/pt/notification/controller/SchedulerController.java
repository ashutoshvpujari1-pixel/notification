package com.pt.notification.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SchedulerController {
	
	static Logger logger = LoggerFactory.getLogger(SchedulerController.class);

	// Runs every 5 seconds (5000 milliseconds)
    @Scheduled(fixedRate = 5000)
    public void executeTaskAtScheduledInterval() {
    	logger.info("A task is scheduled at every 5 seconds..");
    }
}