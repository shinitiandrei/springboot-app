package com.springboot.application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class Application {

	private static final Logger logger = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) throws Exception {
		logger.debug("[MAIN] Current Date : {}", getCurrentDate());
		System.out.println(getCurrentDate());

        SpringApplication.run(Application.class, args);
    }

	private static Date getCurrentDate(){
		return new Date();
	}
}