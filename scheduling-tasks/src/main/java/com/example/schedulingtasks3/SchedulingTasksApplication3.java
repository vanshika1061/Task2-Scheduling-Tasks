package com.example.schedulingtasks3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SchedulingTasksApplication3 {

	public static void main(String[] args) {
		SpringApplication.run(SchedulingTasksApplication3.class);
	}
}