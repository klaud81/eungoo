package com.eungoo.app.controller;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eungoo.app.domain.SelectInfo;

@Controller
public class TestController {
	private static final Logger logger = LoggerFactory.getLogger(TestController.class);

	@RequestMapping(value = "/test")
	public String test(Model model) {
		logger.info("URL 테스트");
		model.addAttribute("message", "Git 수정 테스트");
		return "home";
	}

	@RequestMapping(value = "/testJson")
	public void testJson(Model model, @ModelAttribute SelectInfo selectInfo) {
		logger.info("현재날짜 : " + new java.text.SimpleDateFormat("yyyyMMdd").format(new java.util.Date()));
		logger.info("현재시간 : " + new java.text.SimpleDateFormat("HHmmss").format(new java.util.Date()));

		if (selectInfo.getSelectFileName() != null) {
			List<String> returnList = Arrays.asList(selectInfo.getSelectFileName().split(","));
			model.addAttribute("returnList", returnList);
		}
	}
}
