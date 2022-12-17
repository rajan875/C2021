package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RefTest {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/ref/refconfig.xml");
//		B bref=(B) context.getBean("bref");
//		System.out.println(bref);
//		
		A a=(A) context.getBean("aref");
		System.out.println(a.getX());
		
	}

}
