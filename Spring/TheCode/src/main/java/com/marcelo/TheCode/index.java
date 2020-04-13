package com.marcelo.TheCode;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class index {
	@RequestMapping("/")
	public String jk() {
		return "index.jsp";
		
	}
}	
