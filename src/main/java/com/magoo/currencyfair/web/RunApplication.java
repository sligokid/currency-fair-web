package com.magoo.currencyfair.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class RunApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(RunApplication.class, args);

		System.out.println(ctx.toString());
	}
}
