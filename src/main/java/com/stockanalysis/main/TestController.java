package com.stockanalysis.main;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.Getter;

@RestController
public class TestController {
	@GetMapping("/test")
	public String test() {
		return "Hello World! test3";
	}
}
