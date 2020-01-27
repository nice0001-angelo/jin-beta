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
