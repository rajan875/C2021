package com.springcore.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/constructor/constructorconfig.xml");
		Person per1=(Person) context.getBean("per1");
		System.out.println(per1);
	}

}
