package com.poc.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class PocController {

	@GetMapping(value="/", produces = MediaType.APPLICATION_JSON_VALUE)
	public String index() {
		return "Greetings from Spring Boot!";
	}

	@PostMapping("/demo")
	@ResponseStatus(HttpStatus.OK)
	public String RespondSomething(@RequestBody String param1) {
		return param1.isEmpty() ? param1 : "OK";
	}
}
