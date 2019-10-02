package com.soccer.web.commands;

import javax.servlet.http.HttpServletRequest;

public class MoveCommand extends Command{
	
	public MoveCommand(HttpServletRequest request) {
		super.setRequest(request);
		System.out.println("4. 무브커맨드 들어옴");
		System.out.println(String.format("reqeust값 출력 :%s,%s,%s,%s"
				, request.getParameter("playerId")
				, request.getParameter("solar")
				,request.getParameter("action")
				,request.getParameter("page")));
		setDomain(request.getServletPath().substring(1, request.getServletPath().indexOf(".")));
		setAction(request.getParameter("action"));
		execute();
		
	}
	public void execute() {
	
		super.execute();
		
	}
}
