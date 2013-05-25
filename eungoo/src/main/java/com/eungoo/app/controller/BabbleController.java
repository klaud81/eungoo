package com.eungoo.app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eungoo.app.domain.BabbleTrans;
import com.eungoo.app.service.BabbleService;

@Controller
@RequestMapping(value = "/babble")
public class BabbleController {
	@Autowired
	BabbleService babbleService;

	private static final Logger logger = LoggerFactory.getLogger(BabbleController.class);

	@RequestMapping(value = "/list")
	public void babbleList(Model model) {
		logger.info("babbleList 요청시간 : " + new java.text.SimpleDateFormat("yyyyMMdd").format(new java.util.Date()));
		model.addAttribute("transList", babbleService.list());
	}

	@RequestMapping(value = "/get")
	public void getBabble(Model model, @ModelAttribute BabbleTrans babbleTrans) {
		logger.info("getBabble 요청시간 : " + new java.text.SimpleDateFormat("yyyyMMdd").format(new java.util.Date()));
		model.addAttribute("trans", babbleService.get(babbleTrans.getSeq()));
	}
}
