/*
 * This is a Jin-beta Project
 * File name : SampleController.java
 * Created by : Jinhyun
 * Created on : Jan 2020 
 * Contents : SampleController
 */
package net.jin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	@GetMapping("/index")
	public String hello() {
		return "This is Jinhyun's Spring boot beta project";
	}
}
