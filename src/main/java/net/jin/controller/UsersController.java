package net.jin.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsersController {

	@PostMapping(value="/joinRequest")
	public String joinRequest(HttpServletRequest request) {
		return "index";

	}
	
	@PostMapping(value="/loginRequest")
	public String loginRequest() {
		return "index";
	}
}
