package com.soccer.web.commands;

import javax.servlet.http.HttpServletRequest;

public class Receiver {
	public static Command cmd = new Command();
	
	public static void init(HttpServletRequest request) {
		System.out.println("2. Receiver.init에 들어옴");
		System.out.println(String.format("reqeust값 출력 :%s, %s, %s, %s"
				, request.getParameter("playerId")
				, request.getParameter("solar")
				,request.getParameter("action")
				,request.getParameter("page")));
		cmd = Commander.direct(request);
	}
}
