package uk.gov.companieshouse.filing_notification_sender_java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FilingNotificationSenderJavaApplication {

	public static final String APPLICATION_NAME_SPACE = "filing-notification-sender-java";

	public static void main(String[] args) {
		SpringApplication.run(FilingNotificationSenderJavaApplication.class, args);
	}

}
