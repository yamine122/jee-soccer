package com.soccer.web.commands;

import javax.servlet.http.HttpServletRequest;

public class SearchCommand extends Command{
	
	
	public SearchCommand(HttpServletRequest request) {
		setRequest(request);
		setDomain(request.getServletPath().substring(1, request.getServletPath().indexOf(".")));
		setAction(request.getParameter("action")==null?"move":request.getParameter("action"));
		execute();
	}
	
	public void execute() {
		
	}
}
