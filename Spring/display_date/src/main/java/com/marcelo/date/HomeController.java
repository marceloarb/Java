package com.marcelo.date;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("dojoName", "Burbank");
		return "Index.jsp";
	}
	@RequestMapping("/date")
	public String date(Model model) {
		java.util.Date date=new java.util.Date(); 
		model.addAttribute("date",date);
		return "Date.jsp";
	}
	@RequestMapping("/time")
	public String time(Model model) {
		java.util.Date date=new java.util.Date(); 
		model.addAttribute("time",date);
		return "Time.jsp";
	}
	public String counter(HttpSession session) {
		Integer count = (Integer) session.getAttribute("count");
		count +=1;
		session.setAttribute("count", 10);
		return "Index.jsp";
	}
}
