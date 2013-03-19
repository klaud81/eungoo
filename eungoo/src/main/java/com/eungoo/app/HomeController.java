package com.eungoo.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping(value = "/test")
	public String test(Model model) {
		logger.info("Git 수정 테스트");
		model.addAttribute("message", "Git 수정 테스트");
		return "home";
	}
}
