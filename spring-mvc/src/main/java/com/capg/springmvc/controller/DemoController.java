package com.capg.springmvc.controller;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {

	public DemoController() {
System.out.println("bean created for controller");	
}
	
	@GetMapping("/message")
	public String getMessage(Model m)
	{
		m.addAttribute("msg","helloo");
		m.addAttribute("date",LocalDate.now());
		//return "view.jsp";
		return "view";
	}
}
