
package com.example.schedulingtasks5;

import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks5 {

	private static final Logger logger = LoggerFactory.getLogger(ScheduledTasks5.class);



	 @Scheduled(fixedRate = 3000)


	public void reportCurrentTime() {
		logger.info("Executing scheduled tasks after a fixed interval of 3seconds...: {}", new Date());
		
	}
}