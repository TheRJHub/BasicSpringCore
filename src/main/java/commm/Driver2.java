package commm;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Driver2 {
public static void main(String[] args) {
	BeanFactory b = new ClassPathXmlApplicationContext("applicationSS.xml");
	Library lib=b.getBean("library",Library.class);
//	lib.setLocation("Japan68+1");
	System.out.println(lib.getLocation());
	System.out.println(lib.getName());
	System.out.println(lib.getBook());
}
}
