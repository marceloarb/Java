package com.marcelo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OtherController {
	@RequestMapping("/dojo")
	public String dojo(@RequestParam(value="q",required=false) String dojo) {
		return "The"+dojo+ "Awesome";
	}
	@RequestMapping("/burbank-dojo/{str}")
	public String show(@PathVariable("str")String str) {
		return str;
	}
	@RequestMapping("/dallas/{str}")
	public String dallas(@PathVariable("str")String str) {
		return str;
	}
}
