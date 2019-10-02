package com.soccer.web.services;

import java.util.List;

import com.soccer.web.domains.PlayerBean;


public interface PlayerService {
	//SQL_TEST_002 포지션 종류(중복제거,없으면 빈공간)
	
	//1.로그인
	 public PlayerBean login(PlayerBean param); 
	 //조인
	 public boolean join(PlayerBean param);
	 
	 public List<String> findPositions();
	 //-- SQL_TEST_004-- 수원팀(ID: K02)골키퍼
	 public List<PlayerBean> findByTeamIdPosition(PlayerBean param);
	 //SQL 005
	 public List<PlayerBean> findByTeamIdByHeightByPosition(PlayerBean param);
	 
	
	 
}
