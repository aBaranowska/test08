package com.rec.spring.service;

import org.springframework.stereotype.Component;

@Component
public class ExampleService implements Service {

	public String getMessage() {
		return "Hello world!";
	}

}
