
package com.example.schedulingtasks3;

import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks3 {

	private static final Logger logger = LoggerFactory.getLogger(ScheduledTasks3.class);



	@Scheduled(cron = "0 0/2 * * * *")

	public void reportCurrentTime() {
		logger.info("Executing scheduled task after every 2 minutes...: {}", new Date());
		
	}
}