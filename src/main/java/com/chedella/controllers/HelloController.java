package com.chedella.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	String welcome() {
		return "Welcome to AWS!";
	}
}
