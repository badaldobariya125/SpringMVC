package com.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homectrl {
	
	@RequestMapping
public String home() {
	return "home";
}
}
