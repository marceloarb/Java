package com.marcelo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Human {
	@RequestMapping("")
	public String human(@RequestParam(value="name", required = false) String str,@RequestParam(value="last", required = false) String last) {
		if(str == null) {
			return "Hello Human";
		}
		else {
			return "Hello"+str+last;
		}
	}
}
