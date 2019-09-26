package com.soccer.web.commands;

import com.soccer.web.enums.Action;
import javax.servlet.http.HttpServletRequest;

public class Commander {
	
	public static Command direct(HttpServletRequest request) {
		Command cmd = null;
		System.out.println(Action.valueOf(request.getParameter("action").toUpperCase()).toString());
			switch (Action.valueOf(request.getParameter("action").toUpperCase())) {

			case MOVE:
				cmd = new MoveCommand(request);
				break;
			default :
				break;
			}
	
		return cmd;
	}
	
}
