package com.soccer.web.factories;

import java.sql.Connection;
import java.sql.DriverManager;
import com.soccer.web.factories.DBDriver;

import com.soccer.web.pools.Constants;

public class Maria implements Database{

	@Override
	public Connection getConnection() {
		Connection conn = null;
		try {
			
			Class.forName(DBDriver.MARIA_DRIVER.toString());
			conn = DriverManager.getConnection(
					DBUrl.MARIA_URL.toString(),
					Constants.USERNAME, 
					Constants.PASSWORD);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
	
		
	}

}
