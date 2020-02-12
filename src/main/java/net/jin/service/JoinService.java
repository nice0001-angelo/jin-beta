/*
 * This is a Jin-beta Project
 * File name : JoinService.java
 * Created by : Jinhyun
 * Created on : Jan 2020
 * Contents : JoinService
 */
package net.jin.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import net.jin.model.Users;
import net.jin.repository.UsersRepository;

public class JoinService {
	
	@Autowired
	public UsersRepository usersRepository; 
	
	public void joinUser(HttpServletRequest request) {
			String userId = request.getParameter("user_id");
			String userPw = request.getParameter("user_pw");
			String userName = request.getParameter("user_name");
			
			Users users = new Users(); // object make
			users.setUser_id(userId);
			users.setUser_pw(userPw);
			users.setUser_name(userName);
			
			usersRepository.save(users);
	}
	
	
}
