package com.eungoo.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eungoo.app.service.FreeBoardService;

@Controller
@RequestMapping(value = "/board")
public class FreeBoardController extends JpaController {
	@Autowired
	FreeBoardService freeBoardService;

	@RequestMapping(value = "/list")
	public String list(Model model) {
		model.addAttribute("list", freeBoardService.findAll());
		return "freeboard";
	}

}
