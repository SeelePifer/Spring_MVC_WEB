package com.bolsadeideas.springboot.web.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String home() {
		//Anota la url y redirige
		//return "redirect:/app/index";
		//No anota la url, pero redirige
		return "forward:/app/index";
	}
}
