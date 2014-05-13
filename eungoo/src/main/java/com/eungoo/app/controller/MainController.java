package com.eungoo.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eungoo.app.domain.User;
import com.eungoo.app.service.MainService;

@Controller
public class MainController extends JpaController {
	@Autowired
	MainService mainService;
	
	@RequestMapping(value = "/main")
	public String test(Model model) {
		return "main";
	}
	
	@RequestMapping(value = "/join") 
	public String join(Model model, User user) {
		model.addAttribute("joinResult", mainService.create(user));
		return "main";
	}
}
