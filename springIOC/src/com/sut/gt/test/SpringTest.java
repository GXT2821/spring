package com.sut.gt.test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



import com.sut.gt.Service.IService;

public class SpringTest {
	
	public static void main(String[] args) {
		
		//创建spring的IOC容器对象
		ApplicationContext apc = new ClassPathXmlApplicationContext("spring.xml");
		
		//从IOC中获取Bean实例
		IService hello = apc.getBean("service", IService.class);  
		//引入配置文件
		
		//加载配置文件
		/*BeanFactory f = new XmlBeanFactory(new ClassPathResource("spring.xml"));
		
		IService hello = (IService) f.getBean("service");*/
		Car car = apc.getBean(Car.class);
		hello.service("Helloween");
		System.out.println(car);
		
		Person person = (Person) apc.getBean("person");
		System.out.println(person);
		
		
		
	}

}
