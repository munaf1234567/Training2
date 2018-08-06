package com.exilant.mongodb;

import com.mongodb.DB;
import com.mongodb.MongoClient;

public class getmetedata {

	public static void main(String[] args) {
		MongoClient mc= new MongoClient("localhost",27017);
		System.out.println("connecrtion got"+mc);
		System.out.println("list of dbs from mongodb");
		for(String s:mc.getDatabaseNames())
		{
		DB db=mc.getDB(s);
		
		for(String col:db.getCollectionNames())
		{
			System.out.println("collection name"+col);
		}
		}
		
		
	}

}
