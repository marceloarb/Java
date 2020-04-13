package com.marcelo.DojoSurvey;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Index {
	@RequestMapping("/")
	public String view() {
		return "index.jsp";
	}
}
