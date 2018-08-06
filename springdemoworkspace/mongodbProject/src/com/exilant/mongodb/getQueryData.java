package com.exilant.mongodb;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.model.Projections;

public class getQueryData {

	public static void main(String[] args) {
		MongoClient mc= new MongoClient("localhost",27017);
		
		DB db=mc.getDB("exdb");
		DBCollection dbc= db.getCollection("colors");
		DBObject qcol= new BasicDBObject("color", "Green");
		DBObject sortcol= new BasicDBObject("color", -1);
		DBCursor cursor=dbc.find(qcol).sort(sortcol).limit(1);
		while (cursor.hasNext())
		{
			DBObject obj=cursor.next();
			System.out.println("jsonformat"+obj);
		System.out.println(obj.get("color"));
		System.out.println(obj.get("value"));
		}

	}

}
