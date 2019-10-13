package org.tmplcl.stockstuff.business.ping;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

@Component
public class Ping {
	
	private final LocalDateTime timestamp = LocalDateTime.now();
	private final String message = "pinged successful";
	
	public LocalDateTime getTimestamp() {
		return timestamp;
	}
	public String getMessage() {
		return message;
	}

}
