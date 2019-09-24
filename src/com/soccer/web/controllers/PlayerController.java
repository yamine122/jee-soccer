package com.soccer.web.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.soccer.web.domains.PlayerBean;
import com.soccer.web.serviceimpls.PlayerServiceImpl;




@WebServlet("/player.do")
public class PlayerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    
   
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		PlayerBean player = null;
	
		System.out.println("액션"+action);
		switch (action) {
		case "move":
			
			break;
		case "find2" :
			
			//teamId = request.getParameter("teamId");
			//String position = request.getParameter("position");
		
		
			request.setAttribute("positions", 
					PlayerServiceImpl.getInstance().findPositions());
		break;
		case "find4":
			player = new PlayerBean();
			//teamId = request.getParameter("teamId");
			//String position = request.getParameter("position");
		
			player.setTeamId(request.getParameter("teamId"));
			player.setPosition(request.getParameter("position"));
			
			request.setAttribute("players", PlayerServiceImpl.getInstance().findByTeamIdPosition(player));
			
			
			break;
		case "find5" :
			//teamId = request.getParameter("teamId");
			//String height = request.getParameter("height");
			//String playerName = request.getParameter("playerName");
			player = new PlayerBean();
			player.setTeamId(request.getParameter("teamId"));
			player.setHeight(request.getParameter("height"));
			player.setPlayerName(request.getParameter("playerName"));
			
			
			request.setAttribute("players", PlayerServiceImpl.getInstance().findByTeamIdByHeightByPosition(player));		
			
		break;
		}
		
		
		String page = request.getParameter("page");

		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/"+page+ ".jsp");
		rd.forward(request, response);
		
		
	}



}
