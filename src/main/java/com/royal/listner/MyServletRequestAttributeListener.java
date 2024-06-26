package com.royal.listner;

import jakarta.servlet.ServletRequestAttributeEvent;
import jakarta.servlet.ServletRequestAttributeListener;

public class MyServletRequestAttributeListener implements ServletRequestAttributeListener {

    
	public void attributeAdded(ServletRequestAttributeEvent srae) 
	{
		System.out.println("MyServletRequestAttributeListener :: attributeAdded()---attribute added");
	}
	public void attributeReplaced(ServletRequestAttributeEvent srae) 
	{
		System.out.println("MyServletRequestAttributeListener :: attributeReplaced()---attribute replaced");
		
	}
	public void attributeRemoved(ServletRequestAttributeEvent srae) 
	{
		System.out.println("MyServletRequestAttributeListener :: attributeRemoved()---attribute removed");
		
	}
	
}
