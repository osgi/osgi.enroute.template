package osgi.enroute.template;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.slf4j.Logger;

@Component
public class Template {
	private Logger logger;
	
	@Activate
	void activate() {
		logger.info("Hello World");
	}

	@Deactivate
	void deactivate() {
		logger.info("Goodbye World");
	}

	void setLogger(Logger logger) {
		this.logger = logger;
	}
}
