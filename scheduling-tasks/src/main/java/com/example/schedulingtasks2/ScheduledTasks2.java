
package com.example.schedulingtasks2;

import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks2 {

	private static final Logger logger = LoggerFactory.getLogger(ScheduledTasks2.class);



	@Scheduled(cron = "* 1 * * * *")

	public void reportCurrentTime() {
		logger.info("Executing scheduled task after every 1 minute...: {}", new Date());
		
	}
}