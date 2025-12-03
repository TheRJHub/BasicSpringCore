package coom;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class StudentDriver {
public static void main(String[] args) {
	BeanFactory bff = new ClassPathXmlApplicationContext("StudentDrvr.xml");
	Student s=bff.getBean("student",Student.class);
	System.out.println(s.getName());
	System.out.println(s.getMarks());
}
}
