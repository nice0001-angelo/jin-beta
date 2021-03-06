/*
 * This is a Jin-beta Project
 * File name : UsersController.java
 * Created by : Jinhyun
 * Created on : Jan 2020
 * Contents : for the UsersController
 */
package net.jin.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import net.jin.service.JoinService;

@Controller
public class UsersController {
	

	@PostMapping("/joinRequest")
	public String joinRequest(HttpServletRequest request) {
		JoinService joinService = new JoinService();
		joinService.joinUser(request);
		return "index";
	}
	
	@PostMapping("/loginRequest")
	public String loginRequest() {
		return "index";
	}
}
