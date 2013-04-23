package com.eungoo.app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
		logger.info("URL 테스트");
		model.addAttribute("message", "Git 수정 테스트");
		return "home";
	}

	@RequestMapping(value = "/testJson")
	public void testJson(Model model) {
		logger.info("JSON 테스트");
		List<Map<String, String>> returnList = new ArrayList<Map<String, String>>();
		Map<String, String> returnMap = new HashMap<String, String>();
		returnMap.put("name", "정은구");
		returnMap.put("nick", "SilverNine");
		returnList.add(returnMap);
		model.addAttribute("returnList", returnList);
	}
}
