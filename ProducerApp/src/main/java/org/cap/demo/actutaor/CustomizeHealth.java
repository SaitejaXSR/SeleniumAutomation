package org.cap.demo.actutaor;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class CustomizeHealth implements HealthIndicator {
	
	private final String message="Service A";

	@Override
	public Health health() {
		if(!isRunningServiceA()) {
			return Health.down().withDetail(message, "Not Availble").build();
		}
		return Health.up().withDetail(message, "Availble").build();
	}

	private Boolean isRunningServiceA() {
		return true;
	}
	
}
