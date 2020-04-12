package com.marcelo.firstproject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("hello")
public class HomeController {
	@RequestMapping("")
	public String index(@RequestParam(value="q", required=false) String search) {
		return "You searched for:" + search;
	}
	@RequestMapping("/random")
	public String random() {
		return "Spring works great";
	}
}
