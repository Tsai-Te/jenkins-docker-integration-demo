package com.jenkinsdockerdemo.jenkinsdockerintegrationdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsDockerIntegrationDemoApplication {

	@GetMapping
	public String hello() {
		return "Hello, welcome...";
	}
	public static void main(String[] args) {
		SpringApplication.run(JenkinsDockerIntegrationDemoApplication.class, args);
	}

}
