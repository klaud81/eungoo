package com.eungoo.app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eungoo.app.service.FreeBoardService;

@Controller
public class FreeBoardController {
	private static final Logger logger = LoggerFactory.getLogger(FreeBoardController.class);

	@Autowired
	FreeBoardService freeBoardService;

	@RequestMapping(value = "/freeboard")
	public String test(Model model) {
		model.addAttribute("list", freeBoardService.findAll());
		return "freeboard";
	}
}
