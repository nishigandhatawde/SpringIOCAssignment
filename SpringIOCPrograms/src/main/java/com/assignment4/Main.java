package com.assignment4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/assignment4/config.xml");
		ConstructorMessage bean = context.getBean("cm",ConstructorMessage.class);
		System.out.println(bean);
}
}
