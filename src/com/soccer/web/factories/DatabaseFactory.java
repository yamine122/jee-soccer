package com.soccer.web.factories;



public class DatabaseFactory{
	
	public static Database createDatabase(String vender) {
		Database db = null;
		
		switch (vender) {
		case "oracle": 
			db = new Oracle();
			
			break;

		case "mariadb":
			db = new Maria();
			
			
			break;
		
		case "h2":
			
			break;
		case "db2":
			
			break;

			
			
		}
		return db;
		
	}
	
	
	
}
