package com.beisi.shiro.controller.sys;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class IndexController {
	
	@RequestMapping(value={"/index.html","index","/"},method=RequestMethod.GET)
	public String index() {
		return "index";
	}

}