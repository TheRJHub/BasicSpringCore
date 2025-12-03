package comm;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Driver {
public static void main(String[] args) {
	BeanFactory bf = new ClassPathXmlApplicationContext("applicationS.xml");
	Bank bank=bf.getBean("bank",Bank.class);
//	bank.setLocation("pune");
//	bank.setAcc(null);
	System.out.println(bank.getLocation());
	System.out.println(bank.getName());
	System.out.println(bank.getAcc());
}
}
