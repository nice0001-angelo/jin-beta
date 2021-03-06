/*
 * This is a Jin-beta Project
 * File name : MainController.java
 * Created by : Jinhyun
 * Created on : Jan 2020
 * Contents : for the MainController
 */
package net.jin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/joinPage")
	public String joinPage() {
		return "join";
	}
}
