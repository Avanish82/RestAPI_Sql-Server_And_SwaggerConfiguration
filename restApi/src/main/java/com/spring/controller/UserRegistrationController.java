package com.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController
@Api(tags = "UserRegistrationController", value = "UserRegistrationQueries", description = "UserRegistrationController Queries")

public class UserRegistrationController {
	
	@GetMapping("/show")
	public String show() {
		return "Hi dear";
	}
	
	@GetMapping("/UserName")
	public String userName() {
		return "HI i am avanish";
	}

}
