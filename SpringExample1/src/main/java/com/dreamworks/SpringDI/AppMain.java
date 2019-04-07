package com.dreamworks.SpringDI;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class AppMain {

	public static void main(String[] args) {
		
		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("Bean.xml");
		
		DISetterInjection setter = (DISetterInjection) context.getBean("setterinjection");
		
		System.out.println(setter.getMessage());

		context.registerShutdownHook();
		context.close();
	}

}
