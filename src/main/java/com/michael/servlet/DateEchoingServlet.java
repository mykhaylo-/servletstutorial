package com.michael.servlet;

import java.io.IOException;
import java.util.Date;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class DateEchoingServlet extends GenericServlet {

	private static final long serialVersionUID = 977432935293769391L;

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.getWriter().write(new Date().toString());
		//req.getRequestDispatcher("/echoDate").forward(req, res);
		getServletContext().getRequestDispatcher("/echoDate").forward(req, res);
	}
}
