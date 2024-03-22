package com.techgeek.aws.ecs.springbootdockerawsecsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootDockerAwsEcsDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDockerAwsEcsDemoApplication.class, args);
	}

	@GetMapping("/")
	public String welcome(){
		return "Welcome to AWS ECS!";
	}

	@GetMapping("/{name}")
	public String hello(@PathVariable String name){
		return "Hi " + name + ", Welcome to AWS ECS";
	}

}
