package in.com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.com.service.CustomerService;

public class CustomerTest {

public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		CustomerService service = applicationContext.getBean("customerService",CustomerService.class);
		
		System.out.println(service.findAll().get(0).getFirstname());
		System.out.println(service.findAll().get(0).getLastname());
	}
}
