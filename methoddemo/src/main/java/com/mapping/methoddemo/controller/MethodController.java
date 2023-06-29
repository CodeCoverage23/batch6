package com.mapping.methoddemo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/method")
public class MethodController {

	@GetMapping
	public String getMapping() {
		return "Response from Get Mapping";
	}

	@PostMapping
	public String postMapping() {
		return "Response from Post Mapping";
	}

	@PutMapping
	public String putMapping() {
		return "Response from Put Mapping".toLowerCase();
	}

	@DeleteMapping("/delete")
	public String deleteMapping() {
		String s = "Response from Delete Mapping";
		return s.toUpperCase();
	}

}
