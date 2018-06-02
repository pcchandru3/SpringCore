import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.learn.java.spring.core.repository.CustomerRepository;
import com.learn.java.spring.core.repository.HibernateCustomerRepositoryImpl;
import com.learn.java.spring.core.service.CustomerService;
import com.learn.java.spring.core.service.CustomerServiceImpl;

@Configuration
@ComponentScan({"com.learn.java.spring.core"})
@PropertySource("app.properties")
public class AppConfig {
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer getPropertySourcePlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();

	}
	
	
	@Bean("customerService")
	public CustomerService getCustomerService() {
//		return new CustomerServiceImpl();
		
		
		// Setter Injection
		CustomerServiceImpl service = new CustomerServiceImpl();
		service.setCustomerRepository(getCustomerRepository());

		
		
		// Constructor Injection
//		CustomerServiceImpl service = new CustomerServiceImpl(getCustomerRepository());
		
		return service;
	}

	
	
	@Bean("customerRepository")
	public CustomerRepository getCustomerRepository() {
		return new HibernateCustomerRepositoryImpl();
	}

}
