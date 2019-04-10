package com.dreamworks.javabased;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Ch2BeanConfiguration.class);
		
		AccountService accountService = applicationContext.getBean("accountService", AccountService.class);
		
		System.out.println("Before Money Transfer ......");
		System.out.println("Account 1 Balance :" + accountService.getAccount(1).getBalance());
		System.out.println("Account 2 Balance :" + accountService.getAccount(2).getBalance());
		
		accountService.transferMoney(1,2, 5.0);
		
		System.out.println("After Money Transfer ......");
		System.out.println("Account 1 Balance :" + accountService.getAccount(1).getBalance());
		System.out.println("Account 2 Balance :" + accountService.getAccount(2).getBalance());
	}

}
