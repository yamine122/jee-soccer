package com.soccer.web.daos;

import java.util.List;

import com.soccer.web.domains.PlayerBean;

public interface PlayerDao {
	 //SQL_TEST_002 포지션 종류(중복제거,없으면 빈공간)
	
	 public PlayerBean selectByPlayerIdSolar(PlayerBean param);
	 public boolean insertPlayer(PlayerBean param);
	 public List<String> selectPositions();
	 public List<PlayerBean> selectByTeamIdPositions(PlayerBean param);
	 public List<PlayerBean> selectByTeamIdHeightPositions(PlayerBean param);
	 public List<PlayerBean> selectByMany(PlayerBean param);
}
