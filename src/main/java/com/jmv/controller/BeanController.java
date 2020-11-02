package com.jmv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BeanController {

	@Autowired
	private ApplicationContext ctx;
	
	@GetMapping("/info")
	public String info() {

		StringBuilder sb = new StringBuilder();
		
		for(String bean: ctx.getBeanDefinitionNames())
			sb.append(bean +"\n");
		
		return sb.toString();
	}
}
