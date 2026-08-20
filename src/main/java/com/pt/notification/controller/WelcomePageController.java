package com.pt.notification.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//This will instruct Spring that this class process web view
@Controller 
public class WelcomePageController {

	static Logger logger = LoggerFactory.getLogger(WelcomePageController.class);
	
	@GetMapping("/welcome")
    public String displayWelcomePage(Model model) {
		logger.info("displayWelcomePage started..");
        return "welcome"; // This will look for a html file named welcome.html
    }
}
