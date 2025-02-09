package in.tejas.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.tejas.service.BookService;

public class MyApp {
	public static void main(String [] args) {
		ApplicationContext ctxt= new ClassPathXmlApplicationContext("beansfirsttry.xml");
		BookService bookservice = ctxt.getBean(BookService.class);
		bookservice.saveBook();
	}
}
