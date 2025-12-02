package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class user {
public static void main(String[] args) {
	BeanFactory factory = new ClassPathXmlApplicationContext("application.xml");
	Person person=factory.getBean("person",Person.class);
	System.out.println(person);
	person.weight();
	
	factory.getBean("car",car.class).speed();
	
	Mobile mobile = factory.getBean("mobile", Mobile.class);
	
	System.out.println(mobile.getBrand());
	System.out.println(mobile.getPrice());
}
}
