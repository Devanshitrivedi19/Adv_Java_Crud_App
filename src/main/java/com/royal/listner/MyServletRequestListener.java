package com.royal.listner;

import jakarta.servlet.ServletRequestEvent;
import jakarta.servlet.ServletRequestListener;

public class MyServletRequestListener implements ServletRequestListener {

		public void requestInitialized(ServletRequestEvent sre) 
		{
			System.out.println("MyServletRequestListener :: requestInitialized : request object created");
		}
		public void requestDestroyed(ServletRequestEvent sre) 
		{
			System.out.println("MyServletRequestListener :: requestDestroyed : request object deleted");
		}
	}
	
