package ex.board.spring.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;

@Configuration
public class PropertyPlaceholderConfig {

	@Bean
	public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {

		final PropertySourcesPlaceholderConfigurer pspc = new PropertySourcesPlaceholderConfigurer();
		
		pspc.setLocations(new ClassPathResource("properties/db.properties"));
		pspc.setIgnoreUnresolvablePlaceholders(true);
		
		return pspc;
	}
	
}