package com.mdamine.classifieds;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/admin")
public class AdminController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {

		return "admin/home";
	}

}