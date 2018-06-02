import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learn.java.spring.core.service.CustomerService;

public class Application {

	public static void main(String[] args) {
		
//		CustomerService service = new CustomerServiceImpl();
		
//		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//		
//		CustomerService serviceXML = appContext.getBean("customerService", CustomerService.class);
//		
//		
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		CustomerService service = appContext.getBean("customerService", CustomerService.class);

		System.out.println(service);
		
		CustomerService service3 = appContext.getBean("customerService", CustomerService.class);
		
		
		System.out.println(service3);
		
		
		System.out.println(service.findAll().get(0).getFirstname());
		System.out.println(service3.findAll().get(0).getFirstname());
		
		
	}
	
}
