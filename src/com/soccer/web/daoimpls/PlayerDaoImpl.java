package com.soccer.web.daoimpls;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.soccer.web.pools.*;

import com.soccer.web.daos.PlayerDao;
import com.soccer.web.domains.PlayerBean;
import com.soccer.web.factories.DatabaseFactory;

public class PlayerDaoImpl implements PlayerDao{
	private static PlayerDaoImpl instance =  new PlayerDaoImpl();
	
	public static PlayerDaoImpl getInstance() {return instance;}
	private PlayerDaoImpl() {}



	@Override
	public List<String> selectPositions() {
		List<String> positions = new ArrayList<>();
		try {
			String sql = "SELECT DISTINCT POSITION as position \n"
					+ "FROM PLAYER";
			PreparedStatement stnt = DatabaseFactory
					.createDatabase(Constants.VENDER)
					.getConnection()
					.prepareStatement(sql);
			ResultSet rs = stnt.executeQuery();
			while(rs.next()) {
				positions.add(rs.getString("position"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return positions;
	}

	@Override
	public List<PlayerBean> selectByTeamIdPositions() {
		
		return null;
	}

	@Override
	public List<PlayerBean> selectByTeamIdHeightPositions() {
		
		return null;
		
	}

}
