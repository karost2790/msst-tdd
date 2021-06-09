package com.karost.spring.msstservice1.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	@RequestMapping("/")
	String get() {
		return "Hello from get";
	}
	
	@RequestMapping("/index")
	String index() {
		return "Hello from index";
	}
}
