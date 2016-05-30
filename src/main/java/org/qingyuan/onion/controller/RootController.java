package org.qingyuan.onion.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RootController {

	private static final String INDEX="index";
    @RequestMapping(value="/")
	public String index(){
		return INDEX;
	}
}
