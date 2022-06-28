package com.codebuffer.cloud.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {
	
	@GetMapping("/userServiceFallBack")
	public String userServiceFallBackMethod() {
		return "User service is takien longer than expected";
	}
	@GetMapping("/departmentServiceFallBack")
	public String departmentServiceFallBackMethod() {
		return "department service is takien longer than expected";
	}
}
