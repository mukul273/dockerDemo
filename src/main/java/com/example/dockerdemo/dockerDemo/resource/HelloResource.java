package com.example.dockerdemo.dockerDemo.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/docker/hello")
public class HelloResource {
	
	@GetMapping
	public String hello() {
		return "Hello Sucker !!! Did you get the docker ??";
	}
}
