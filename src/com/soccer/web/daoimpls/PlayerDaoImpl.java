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
	public PlayerBean selectByPlayerIdSolar(PlayerBean param) {
		PlayerBean player = null;
		
		String sql = "SELECT * \n" + 
				"FROM PLAYER \n" + 
				"WHERE PLAYER_ID LIKE ? \n" + 
				"    AND SOLAR LIKE ?";
		
		try {
			PreparedStatement stmt = DatabaseFactory
					.createDatabase(Constants.VENDER)
					.getConnection()
					.prepareStatement(sql);
			stmt.setString(1, param.getPlayerId());
			stmt.setString(2, param.getSolar());
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				player = new PlayerBean();
				player.setBackNo(rs.getString("BACK_NO"));
				player.setBirthDate(rs.getString("BIRTH_DATE"));
				player.setEPlayerName(rs.getString("E_PLAYER_NAME"));
				player.setHeight(rs.getString("HEIGHT"));
				player.setJoinYyyy(rs.getString("JOIN_YYYY"));
				player.setNation(rs.getString("NATION"));
				player.setNickname(rs.getString("NICKNAME"));
				player.setPlayerId(rs.getString("PLAYER_ID"));
				player.setPlayerName(rs.getString("PLAYER_NAME"));
				player.setPosition(rs.getString("POSITION"));
				player.setSolar(rs.getString("SOLAR"));
				player.setTeamId(rs.getString("TEAM_ID"));
				player.setWeight(rs.getString("WEIGHT"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return player;
	}
	
	@Override
	public boolean insertPlayer(PlayerBean param) {
		boolean flag = false;
		try {
			String sql = "INSERT INTO PLAYER(PLAYER_ID , SOLAR, TEAM_ID, PLAYER_NAME)\r\n" + 
					"VALUES(?,?,'K03','김광진')";
			PreparedStatement stmt = DatabaseFactory
					.createDatabase(Constants.VENDER)
					.getConnection()
					.prepareStatement(sql);
			stmt.setString(1, param.getPlayerId());
			stmt.setString(2, param.getSolar());
			int rs = stmt.executeUpdate();
			flag =(rs==1) ? 	 true    :	 false;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}


	@Override
	public List<String> selectPositions() {
		List<String> positions = new ArrayList<>();
		try {
			String sql = "SELECT DISTINCT POSITION as position \n"
					+ "FROM PLAYER";
			PreparedStatement stmt = DatabaseFactory
					.createDatabase(Constants.VENDER)
					.getConnection()  
					.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				positions.add(rs.getString("position"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return positions;
	}

	@Override
	public List<PlayerBean> selectByTeamIdPositions(PlayerBean param) {
		List<PlayerBean> list = null;
		
		try {
			String sql = "SELECT PLAYER_NAME, POSITION \n" + 
					"FROM PLAYER\n" + 
					"WHERE TEAM_ID LIKE ?\n" + 
					"    AND POSITION LIKE ?";
			PreparedStatement stmt = DatabaseFactory
					.createDatabase(Constants.VENDER)
					.getConnection()
					.prepareStatement(sql);
			stmt.setString(1, param.getTeamId());
			stmt.setString(2, param.getPosition());
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				list = new ArrayList<>();
				list.add(param);
				
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<PlayerBean> selectByTeamIdHeightPositions(PlayerBean param) {
		List<PlayerBean> list = new ArrayList<>();
		return list;
		
	}
	@Override
	public List<PlayerBean> selectByMany(PlayerBean param) {
		List<PlayerBean> list = new ArrayList<>();
		String sql = "? ? ? ?";
		try {
			PreparedStatement stmt = DatabaseFactory
					.createDatabase(Constants.VENDER)
					.getConnection()
					.prepareStatement(sql);
			stmt.setString(1, param.getBackNo());
			stmt.setString(2, param.getBirthDate());
			stmt.setString(3, param.getEPlayerName());
			stmt.setString(4, param.getHeight());
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	

}
