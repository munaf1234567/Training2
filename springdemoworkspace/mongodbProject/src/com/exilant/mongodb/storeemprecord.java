package com.exilant.mongodb;

import java.util.*;
import java.util.Map;

import org.bson.Document;

import com.google.gson.Gson;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.util.JSON;

public class storeemprecord {
	public static void main(String[] args) {
MongoClient mc= new MongoClient("localhost",27017);
		
		DB db=mc.getDB("exdb");
		DBCollection dbc= db.getCollection("colors");
		DBObject obj= new BasicDBObject();
		obj.put("color", "red");
		obj.put("value", "5.0");
		//dbc.save(obj);
	///////////////////////////////////////////////////////////////
		Map<String,Object> obj1= new HashMap<>();
		obj1.put("color", "yel");
		obj1.put("value", "7.0");
		//dbc.save(new BasicDBObject(obj1));
		/////////////////////////////////////////////////////////////////////////////
		String jsonstr="{color:'black',value:88}";
		//dbc.save((DBObject)JSON.parse(jsonstr));
		/////////////////////////////////////////////////////////////////////////////
		
		Employee emp= new Employee();
		emp.setEmpid(100);
		emp.setEmpname("abc");
		emp.setEmpsal(5000);
		emp.setEmpemail("emp@mmmm");
	dbc.save(emp);
//		JSON.parse(emp.toString());
		
		
		
	
	}

}
