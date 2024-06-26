package com.royal.listner;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;


public class MyServletContextListener implements ServletContextListener {

	public void contextInitialized(ServletContextEvent sce) 
	{
		System.out.println("MyServletContextListener :: contextInitialized : context object created");
	}
	public void contextDestroyed(ServletContextEvent sce) 
	{
		System.out.println("MyServletContextListener :: contextDestroyed : context object deleted");
	}
	
}
