package com.kk.springboot.starter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler {
	
	@RequestMapping("/hi")
	public String sayHai() {
		return "Hireply";
	}

}
