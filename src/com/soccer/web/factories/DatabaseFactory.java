package com.soccer.web.factories;

import com.soccer.web.factories.DB;

public class DatabaseFactory{
	
	public static Database createDatabase(String vendor) {
		Database db = null;
		switch (DB.valueOf(vendor.toUpperCase())) {
		
		case ORACLE : db = new Oracle();
			
			break;

		case MARIA : db = new Maria();
			break;
		}
		
		return db;
	}
	
}
