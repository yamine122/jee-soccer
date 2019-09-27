package com.soccer.web.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.soccer.web.pools.Constants;


@WebServlet("/facade.do")
public class FacadeContorller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	enum Resources{
		CTX,CSS,JS,IMG
	}
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("퍼사드로 들어옴");
		for(Resources r : Resources.values()) {
			System.out.println(">>"+r.toString().toLowerCase()); 
			
			request.getSession().setAttribute(r.toString().toLowerCase(),
					(r.toString().toLowerCase().equals("ctx"))?
							request.getContextPath() : 
								request.getContextPath()+"/resources/"+r.toString().toLowerCase());

		}
		
		
		request
		.getRequestDispatcher(String.format(
				Constants.DOUBLE_PATH,
				request.getServletPath().
				substring(1,request.getServletPath()
						.indexOf(".")),"login"))
		.forward(request, response);
	}

	

}
