package com.sut.gt.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sut.gt.annotation.controller.UserController;
import com.sut.gt.annotation.repository.UserRepository;
import com.sut.gt.annotation.service.UserService;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext p = new ClassPathXmlApplicationContext("bean-annotation.xml");
		
//		TestObject to = (TestObject) p.getBean("testObject");
//		System.out.println(to);
		
		UserController controller = (UserController) p.getBean("userController");
		System.out.println(controller);
		controller.execute();
		
		
//		UserService service = (UserService) p.getBean("userService");
//		System.out.println(service);
		
//		UserRepository repository = (UserRepository) p.getBean("userRepository");
//		System.out.println(repository);
	}

}
