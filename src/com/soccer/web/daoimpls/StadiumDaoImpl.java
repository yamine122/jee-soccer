package com.soccer.web.daoimpls;

import com.soccer.web.daos.StadiumDao;

public class StadiumDaoImpl implements StadiumDao{
	private static StadiumDaoImpl instance = new StadiumDaoImpl();

	public static StadiumDaoImpl getInstance() {
		return instance;
	}
	private StadiumDaoImpl() {
		// TODO Auto-generated constructor stub
	}
}
