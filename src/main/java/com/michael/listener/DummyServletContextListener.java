package com.michael.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class DummyServletContextListener implements  ServletContextListener{

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("Source: " + sce.getSource());
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		
	}

}
