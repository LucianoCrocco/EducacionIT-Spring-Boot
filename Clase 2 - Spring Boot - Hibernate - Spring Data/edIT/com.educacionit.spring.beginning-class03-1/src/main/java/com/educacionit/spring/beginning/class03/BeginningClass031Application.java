package com.educacionit.spring.beginning.class03;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
public class BeginningClass031Application {

	@RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }
    
	public static void main(String[] args) {
		SpringApplication.run (BeginningClass031Application.class, args);
	}
}
