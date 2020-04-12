package com.marcelo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coding")
public class Controller {
	@RequestMapping("")
	public String coding() {
		return "Hello Coding Dojo";
	}
	@RequestMapping("/python")
	public String python() {
		return "Python was awesome";
	}
	@RequestMapping("/java")
	public String java() {
		return "Java was awesome";
	}
}
