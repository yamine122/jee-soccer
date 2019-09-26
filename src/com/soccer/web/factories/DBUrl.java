package com.soccer.web.factories;

public enum DBUrl {
	ORACLE_URL,MARIA_URL,MYSQL_URL;
	@Override
	public String toString() {
		
		String url = "";
		switch (this) {
		case ORACLE_URL:
			url = "jdbc:oracle:thin:@localhost:1521:xe";
			break;
		case MARIA_URL:
			url = "jdbc:mariadb://localhost:3306";
			break;

		case MYSQL_URL:
			
			break;


		default:
			break;
		}
		return url;
	}
}
