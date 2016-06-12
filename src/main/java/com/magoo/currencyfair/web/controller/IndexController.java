package com.magoo.currencyfair.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/")
	public String home() {
		return "index";
	}

	@RequestMapping("/index")
	public String index() {
		return "index";
	}

}