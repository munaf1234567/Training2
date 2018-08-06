package com.exilant.mongodb;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

public class getmanyDoc2 {

	public static void main(String[] args) {
		MongoClient mc= new MongoClient("localhost",27017);
		
		DB db=mc.getDB("exdb");
		DBCollection dbc= db.getCollection("colors");
		DBCursor cursor=dbc.find();
		while (cursor.hasNext())
		{
			DBObject obj=cursor.next();
		System.out.println(obj.get("color"));
		System.out.println(obj.get("value"));
		}

	}

}
