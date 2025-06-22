package com.enduser;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

import com.enduser.constants.AppConstants;

@Configuration
public class KafkaConsumerconfig {
	@KafkaListener(topics = AppConstants.LOCATION_UPDATE_TOPIC , groupId = AppConstants.GROUP_ID)
		public void updatedLocation(String value) {
			System.out.println(value);
		}
}
