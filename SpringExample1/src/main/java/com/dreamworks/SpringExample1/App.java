package com.dreamworks.SpringExample1;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("Bean.xml");
        
        SpringIOC ioc = context.getBean(SpringIOC.class);
        
        ioc.display();
        
        context.close();
    }
}

