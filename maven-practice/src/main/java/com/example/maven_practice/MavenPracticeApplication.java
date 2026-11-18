package com.example.maven_practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.apache.commons.lang3.StringUtils;

@SpringBootApplication
public class MavenPracticeApplication {

	public static void main(String[] args) {
		System.out.println(StringUtils.isEmpty(""));

		SpringApplication.run(MavenPracticeApplication.class, args);
	}

}
