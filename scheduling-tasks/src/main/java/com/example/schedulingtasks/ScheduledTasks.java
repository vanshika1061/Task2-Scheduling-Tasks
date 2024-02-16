
package com.example.schedulingtasks;

//import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {

	private static final Logger logger = LoggerFactory.getLogger(ScheduledTasks.class);

//	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

	@Scheduled(cron = "59 32 11 * * *")

	public void reportCurrentTime() {
		logger.info("Executing scheduled task daily at 11:32:59 A.M. ...: {}", new Date());
		
	}
}