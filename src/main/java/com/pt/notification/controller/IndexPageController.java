package com.pt.notification.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.pt.notification.NotificationApplication;

//This will instruct Spring that this class process web view
@Controller 
public class IndexPageController {

	static Logger logger = LoggerFactory.getLogger(IndexPageController.class);
	
	@GetMapping("/index")
    public String displayIndexPage(Model model) {
		logger.info("displayIndexPage started..");
		
        model.addAttribute("message_hello", "Hello, Thanks for visiting Website..");
        return "index"; // This will look for a html file named index.html
    }
}