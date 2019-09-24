package com.soccer.web.factories;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;

import lombok.Data;
@Data
public class DatabaseBean implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String url,driver,userid,password;
	private Connection conn;
	
	
	public DatabaseBean(String driver,String url,  String userid, String password) {
		this.url = url;
		this.userid = userid;
		this.password = password;
		this.driver = driver;
		
	}
	
	public Connection getConnection() {
		
		try {
			Class.forName(driver);
			//램의 특정부분에 오라클 드라이버를 로드하라는 명령
			conn = DriverManager.getConnection(url,userid,password);
			//자바와 오라클을 연결
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	

}
