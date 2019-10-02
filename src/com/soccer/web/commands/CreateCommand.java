package com.soccer.web.commands;

import javax.servlet.http.HttpServletRequest;

import com.soccer.web.domains.PlayerBean;
import com.soccer.web.pools.Constants;
import com.soccer.web.serviceimpls.PlayerServiceImpl;

public class CreateCommand extends Command{

	public CreateCommand(HttpServletRequest request) {
		setRequest(request);
		setAction(action);
		setDomain(domain);
		this.execute();
	}
	@Override
	public void execute() {
		PlayerBean param = new PlayerBean();
		param.setPlayerId(request.getParameter("playerId"));
		param.setSolar(request.getParameter("solar"));
		if(PlayerServiceImpl.getInstance().join(param)) {
			System.out.println("회원가입성공");
			setView(String.format(Constants.DOUBLE_PATH, "facade","main"));
			System.out.println("셋뷰"+getView());
		}else {
			System.out.println("회원가입실패");
			
		}
	}
}
