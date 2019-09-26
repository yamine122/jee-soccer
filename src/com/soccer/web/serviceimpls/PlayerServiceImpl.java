package com.soccer.web.serviceimpls;


import java.util.List;

import com.soccer.web.daoimpls.PlayerDaoImpl;
import com.soccer.web.domains.PlayerBean;
import com.soccer.web.services.PlayerService;

public class PlayerServiceImpl implements PlayerService{
	private static PlayerServiceImpl instance = new PlayerServiceImpl();

	public static PlayerServiceImpl getInstance() {return instance;}

	private PlayerServiceImpl() {}
	
	@Override
	public PlayerBean login(PlayerBean param) {

		System.out.println("4.2. PlayerServiceImpl 들어옴");
		System.out.println(String.format("param 값 출력 : %s, %s ",
				param.getPlayerId(), 
				param.getSolar()));
		return PlayerDaoImpl.getInstance().selectByPlayerIdSolar(param);
		
		
	}
	
	@Override
	public List<String> findPositions() {
		return PlayerDaoImpl
				.getInstance()
				.selectPositions();
	}
	

	@Override
	public List<PlayerBean> findByTeamIdPosition(PlayerBean param) {
		List<PlayerBean> players = PlayerDaoImpl
				.getInstance()
				.selectByTeamIdPositions();
	
				
		return players;
	}
	@Override
	public List<PlayerBean> findByTeamIdByHeightByPosition(PlayerBean param) {
		List<PlayerBean> players = PlayerDaoImpl
				.getInstance()
				.selectByTeamIdHeightPositions();
		
		return players;
	}

	

}
