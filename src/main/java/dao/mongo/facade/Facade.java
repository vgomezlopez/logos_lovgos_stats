package dao.mongo.facade;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.mongo.services.UsersService;

public class Facade {
	
private static Facade uniqueInstance;
	
	
	public static synchronized Facade getInstance(){
		if(uniqueInstance==null) uniqueInstance = new Facade();
		return uniqueInstance;
	}

	private ApplicationContext springContext;
	
	//declaration des services
	private UsersService productService;
	
	private Facade() {
		springContext = new ClassPathXmlApplicationContext("mongo-context.xml");
		//chargement des services
		productService = springContext.getBean(UsersService.class);

	}

	public UsersService getUsersService() {
		return productService;
	}



}
