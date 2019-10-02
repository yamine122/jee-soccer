package com.soccer.web.commands;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.soccer.web.domains.PlayerBean;
import com.soccer.web.pools.Constants;
import com.soccer.web.serviceimpls.PlayerServiceImpl;

public class SearchCommand extends Command{
	
	
	public SearchCommand(HttpServletRequest request) {
		setRequest(request);
		setDomain(domain);
		setAction(action);
		
		this.execute();
	}
	
	public void execute() {
		
		switch (request.getParameter("page")) {
		case "2_positions_answer":
			List<String> positions = new ArrayList<>();
			
			positions = PlayerServiceImpl.getInstance().findPositions();
			request.setAttribute("page", "2_positions_answer");
			request.setAttribute("positions", positions);
			this.view = String.format(Constants.DOUBLE_PATH, "player","main");
			break;
		case "4_find_by_teamid_position" :
			List<PlayerBean> list = new ArrayList<PlayerBean>();
			PlayerBean player = new PlayerBean();
			list = PlayerServiceImpl.getInstance().findByTeamIdPosition(player);
			request.setAttribute("page", "4_find_by_teamid_position");
			request.setAttribute("list", list);
			
			break;

		default:
			break;
		}
		
	}
	
}
