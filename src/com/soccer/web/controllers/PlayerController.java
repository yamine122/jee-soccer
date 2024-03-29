package com.soccer.web.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.soccer.web.commands.Command;
import com.soccer.web.commands.Receiver;
import com.soccer.web.commands.Sender;
import com.soccer.web.domains.PlayerBean;
import com.soccer.web.serviceimpls.PlayerServiceImpl;




@WebServlet("/player.do")
public class PlayerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    
   
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("들어옴");
		// playerId, solar , action , page
	
		System.out.println(String.format("reqeust값 출력 :%s,%s,%s,%s"
				, request.getParameter("playerId")
				, request.getParameter("solar")
				,request.getParameter("action")
				,request.getParameter("page")));
		Receiver.init(request);
		Sender.forward(request, response);
		
		
		
		
	}



}
