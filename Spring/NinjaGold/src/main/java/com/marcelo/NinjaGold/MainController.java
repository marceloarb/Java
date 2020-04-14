package com.marcelo.NinjaGold;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	@RequestMapping("/")
	public String index(HttpSession session) {
		if(session.getAttribute("gold") == null) {
			session.setAttribute("gold", 0);
		}
		return "index.jsp";
	}
}
