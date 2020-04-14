package com.marcelo.NinjaGold;

import java.util.concurrent.ThreadLocalRandom;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {
	@RequestMapping(value="/process", method=RequestMethod.POST)
	public String process(@RequestParam(value="building") String building, HttpSession session) {
		if(building.equals("farm")) {
			int num = ThreadLocalRandom.current().nextInt(10, 20 + 1);
			int gold = (int) session.getAttribute("gold");
			session.setAttribute("gold", gold+num);
		}
		if(building.equals("cave")) {
			int num = ThreadLocalRandom.current().nextInt(5, 10 + 1);
			int gold = (int) session.getAttribute("gold");
			session.setAttribute("gold", gold+num);
			
		}
		if(building.equals("house")) {
			int num = ThreadLocalRandom.current().nextInt(2, 5 + 1);
			int gold = (int) session.getAttribute("gold");
			session.setAttribute("gold", gold+num);
			
		}
		if(building.equals("casino")) {
			int num = ThreadLocalRandom.current().nextInt(-50, 50 + 1);
			int gold = (int) session.getAttribute("gold");
			session.setAttribute("gold", gold+num);
			
		}
		
		
		return "redirect:/";
	}
}
