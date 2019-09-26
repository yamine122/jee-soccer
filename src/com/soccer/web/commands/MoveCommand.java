package com.soccer.web.commands;

import javax.servlet.http.HttpServletRequest;

public class MoveCommand extends Command{
	
	public MoveCommand(HttpServletRequest request) {
		setRequest(request);
		setAction(request.getParameter("action")==null?"move":request.getParameter("action"));
		setPage(request.getParameter("page"));
		execute();
		
	}
}
