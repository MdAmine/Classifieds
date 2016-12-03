package com.mdamine.classifieds.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mdamine.classifieds.services.ClassifiedService;

@Controller
@RequestMapping(value = "/admin")
public class AdminController {

	@Autowired
	private ClassifiedService classifiedService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {

		model.addAttribute("classifieds", classifiedService.getAllClassifieds());

		return "admin/home";
	}

}