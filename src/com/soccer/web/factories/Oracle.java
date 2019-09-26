package com.soccer.web.factories;

import java.sql.Connection;
import java.sql.DriverManager;

import com.soccer.web.pools.Constants;

public class Oracle implements Database{

	@Override
	public Connection getConnection() {
		Connection conn = null;
		
		try {
			
			Class.forName(DBDriver.ORACLE_DRIVER.toString());
			conn = DriverManager.getConnection(
					DBUrl.ORACLE_URL.toString(),
					Constants.USERNAME, 
					Constants.PASSWORD);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
	}
	

}
