package com.soccer.web.commands;

import com.soccer.web.enums.Action;
import javax.servlet.http.HttpServletRequest;

public class Commander {
	
	public static Command direct(HttpServletRequest request) {
		System.out.println("3. commander.direct() 에 들어옴");
		System.out.println(String.format("reqeust값 출력 :%s,%s,%s,%s"
				, request.getParameter("playerId")
				, request.getParameter("solar")
				,request.getParameter("action")
				,request.getParameter("page")));
		
		Command cmd = null;
		System.out.println(Action.valueOf(request.getParameter("action").toUpperCase()).toString());
			switch (Action.valueOf(request.getParameter("action").toUpperCase())) {
			
			case LOGIN :
				cmd = new LoginCommand(request);
				
				break;

			case MOVE:
				cmd = new MoveCommand(request);
				break;
			
				
			default :
				break;
			}
	
		return cmd;
	}
	
}
