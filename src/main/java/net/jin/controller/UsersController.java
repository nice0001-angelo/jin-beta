package net.jin.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import net.jin.repository.UsersRepository;
import net.jin.service.JoinService;

@Controller
public class UsersController {
	
	private UsersRepository usersRepository;
	
	@PostMapping(value="/joinRequest")
	public String joinRequest(HttpServletRequest request) {
		JoinService joinService = new JoinService();
		joinService.joinUser(request, usersRepository);
		
		return "index";

	}
	
	@PostMapping(value="/loginRequest")
	public String loginRequest() {
		return "index";
	}
}
