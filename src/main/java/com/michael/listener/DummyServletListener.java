package com.michael.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class DummyServletListener implements ServletRequestListener{

	@Override
	public void requestDestroyed(ServletRequestEvent sre) {
		System.out.println("request destropyed");
		
	}

	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		System.out.println("request initialized");
		
	}

}
