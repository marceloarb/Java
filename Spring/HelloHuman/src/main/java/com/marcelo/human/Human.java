package com.marcelo.human;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/human")
public class Human {
	@RequestMapping("")
	public String human(@RequestParam(value="name", required = false) String str) {
		if(str == null) {
			return "Hello Human";
		}
		else {
			return "Hello"+str;
		}
	}
	
}
