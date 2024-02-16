package com.example.schedulingtasks4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SchedulingTasksApplication4 {

	public static void main(String[] args) {
		SpringApplication.run(SchedulingTasksApplication4.class);
	}
}