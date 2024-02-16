package com.example.schedulingtasks5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SchedulingTasksApplication5 {

	public static void main(String[] args) {
		SpringApplication.run(SchedulingTasksApplication5.class);
	}
}