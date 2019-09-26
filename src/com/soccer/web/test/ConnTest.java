package com.soccer.web.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.soccer.web.factories.DB;
import com.soccer.web.factories.DBUrl;
import com.soccer.web.pools.Constants;

public class ConnTest {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stnt = null;
		ResultSet rs = null;
		
		try {
			Class.forName(DB.ORACLE.toString());
			conn = DriverManager.getConnection(DBUrl.ORACLE_URL.toString(),Constants.USERNAME,Constants.PASSWORD);
			if(conn != null) {
				System.out.println("연결성공");
				stnt = conn.createStatement();
				rs = stnt.executeQuery("SELECT T.TEAM_NAME teamName, P.PLAYER_NAME 선수명, P.HEIGHT 키, P.POSITION 포지션\r\n" + 
						"FROM PLAYER P JOIN TEAM T\r\n" + 
						"    ON P.TEAM_ID LIKE T.TEAM_ID\r\n" + 
						"WHERE P.TEAM_ID IN ('K07','K08','K09')\r\n" + 
						"    AND P.POSITION IN ('GK','MF')");
				List<String> list = new ArrayList<>();
				while(rs.next()) {
					list.add(rs.getString("teamName"));
				}
				
				
				
				System.out.println("팀명 :\n"+list);
				
				
				
			}else {
				System.out.println("연결실패");
			}
		} catch (Exception e) {
		e.printStackTrace();
		}
	}
}
