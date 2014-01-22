package com.eungoo.app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	private static final Logger logger = LoggerFactory
			.getLogger(MainController.class);

	@RequestMapping(value = "/main")
	public String test(Model model) {
		logger.info("URL 테스트");
		model.addAttribute("message", "Git 수정 테스트");
		return "main";
	}
}
