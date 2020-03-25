package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Student;

@Controller
public class HomeController {
	@GetMapping(value = "/hello")
	public String showHome(Model model) {
		model.addAttribute("student", new Student());
		return "index";
	}

	@PostMapping(value = "/processForm")
	public String processForm(@Valid @ModelAttribute("student") Student student, BindingResult result) {
		if (result.hasErrors())
			return "index";
		else
			return "student-confirm";
	}
}
