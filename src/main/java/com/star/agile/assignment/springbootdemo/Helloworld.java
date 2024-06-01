package com.star.agile.assignment.springbootdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Helloworld {

	@GetMapping("/Hello")
	String Sayhelloworld() {
		return "This is Ansible project";
	}
}
