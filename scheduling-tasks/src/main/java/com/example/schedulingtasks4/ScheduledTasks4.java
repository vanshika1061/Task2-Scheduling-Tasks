
package com.example.schedulingtasks4;

import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks4 {

	private static final Logger logger = LoggerFactory.getLogger(ScheduledTasks4.class);



	@Scheduled(initialDelay = 10000, fixedDelay =5000)

	public void reportCurrentTime() {
		logger.info("Executing scheduled tasks after 5seconds with an intial delay of 10sec...: {}", new Date());
		
	}
}