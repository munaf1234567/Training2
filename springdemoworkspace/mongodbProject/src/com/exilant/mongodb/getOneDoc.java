package com.exilant.mongodb;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

public class getOneDoc {

	public static void main(String[] args) {
		MongoClient mc= new MongoClient("localhost",27017);
		
		DB db=mc.getDB("exdb");
		DBCollection dbc= db.getCollection("colors");
		DBObject myObj=dbc.findOne();
		System.out.println(myObj.get("color"));
		System.out.println(myObj.get("value"));
	

	}

}
