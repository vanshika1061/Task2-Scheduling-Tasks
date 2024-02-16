package com.example.schedulingtasks1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SchedulingTasksApplication1 {

	public static void main(String[] args) {
		SpringApplication.run(SchedulingTasksApplication1.class);
	}
}