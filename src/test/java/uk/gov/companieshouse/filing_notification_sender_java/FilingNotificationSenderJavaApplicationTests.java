package uk.gov.companieshouse.filing_notification_sender_java;

import uk.gov.companieshouse.filing_notification_sender_java.config.TestConfig;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestConfig.class)
@SpringBootTest
class FilingNotificationSenderJavaApplicationTests {

	@Test
	void contextLoads() {
	}

}
