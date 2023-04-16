package com.revature;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
	
	@GetMapping("/")
	public String HelloWorld() {
		
		return "Hello, World";
	}

}
