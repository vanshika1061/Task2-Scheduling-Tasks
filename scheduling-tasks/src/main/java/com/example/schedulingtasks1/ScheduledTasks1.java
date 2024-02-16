
package com.example.schedulingtasks1;

import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks1 {

	private static final Logger logger = LoggerFactory.getLogger(ScheduledTasks1.class);



	@Scheduled(cron = "2 * * * * *")

	public void reportCurrentTime() {
		logger.info("Task Scheduled at every 2nd second of every minute...: {}", new Date());
		
	}
}