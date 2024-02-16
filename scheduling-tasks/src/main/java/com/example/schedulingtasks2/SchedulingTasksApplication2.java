package com.example.schedulingtasks2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SchedulingTasksApplication2 {

	public static void main(String[] args) {
		SpringApplication.run(SchedulingTasksApplication2.class);
	}
}