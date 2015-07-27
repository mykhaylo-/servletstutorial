package com.michael.listener;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class DummyHttpSessionActivationListener implements HttpSessionActivationListener, HttpSessionListener {

	@Override
	public void sessionWillPassivate(HttpSessionEvent se) {
		System.out.println("Http session passivation source:" + se.getSource());
	}

	@Override
	public void sessionDidActivate(HttpSessionEvent se) {
		System.out.println("Http session activation source:" + se.getSource());
		
	}

	@Override
	public void sessionCreated(HttpSessionEvent se) {
		System.out.println("Http session created source:" + se.getSource());
		
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		System.out.println("Http session destroyed source:" + se.getSource());
		
	}

}
