package com.capg.springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.capg.springmvc.model.Trainee;
import com.capg.springmvc.service.TraineeService;

@Controller
public class TraineeController {
	@Autowired
	TraineeService service;

//	@PostMapping("/add")
//	public String addTrainee(HttpServletRequest request)
//	{
//		int tId=Integer.parseInt(request.getParameter("tid"));
//		String tName=request.getParameter("tname");
//		String dept=request.getParameter("dept");
//		
//		Trainee t1=new Trainee(tId,tName,dept);
//		request.setAttribute("trainee", t1);
//		return "success";
//	}
	
//	@PostMapping("/add")
//	public String addTrainee(@RequestParam ("tId") int id,@RequestParam("tName") String name,@RequestParam("dept") String dept, Model m)
//	{
//		
//		Trainee t1=new Trainee(id,name,dept);
//		m.addAttribute("trainee", t1);
//		return "success";
//	}

	@PostMapping("/add")
	public String addTrainee(@ModelAttribute Trainee t1 , Model m)
	{
		service.addTrainee(t1);
		m.addAttribute("trainee", t1);
		return "success";
		
	}
	
	@GetMapping("/find")
	public String findTrainee(@RequestParam("tId") int id, Model m)
	{
		Trainee t1=service.getTrainee(id);
		m.addAttribute("trainee", t1);
		return "view";
	}
}
