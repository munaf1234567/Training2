package com.exilant.commons;

import org.apache.commons.collections.map.HashedMap;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.sql.*;
import org.apache.spark.sql.types.DataType;
import org.apache.spark.sql.types.DataTypes;
import org.apache.spark.sql.types.StructField;
import org.apache.spark.sql.types.StructType;

import static org.apache.spark.sql.functions.*;

import java.util.*;
public class SparkSqlDemo {

	public static void main(String[] args) {

	     Logger.getLogger("org").setLevel(Level.ERROR);
	     Logger.getLogger("akka").setLevel(Level.ERROR);
	 	JavaSparkContext spContext = SparkConnection.getContext();
	 	SparkSession spSession =SparkConnection.getSession();
	 	
	 	Dataset<Row> empDatafields=spSession.read().json("./dada/cust.json");
	 	//empDatafields.show();
	 	//.printSchema();
	 	
	 	//data  queries
	 	System.out.println("select demo");
	 	
	 	empDatafields.select(col("name"),col("salary")).show();
	 	empDatafields.filter(col("gender").equalTo("male")).show();
	 	empDatafields.groupBy(col("gender")).count().show();
		Dataset<Row> summDatafields= empDatafields.groupBy(col("deptid")).agg(avg(empDatafields.col("salary")), max("age"));
		//---------------------------------------------------------------------------------------------
		Department d1= new Department(100, "develop");
		Department d2= new Department(200, "testing");
		List<Department> deptList= new ArrayList<Department>();
		deptList.add(d1);
		deptList.add(d2);
		Dataset<Row> deptDatafields=spSession.createDataFrame(deptList, Department.class);
		System.out.println("dept contents are ");
		//deptDatafields.show();
		//---------------------------------------------------------------------------------------------
		System.out.println("join Employee with Dept");
		Dataset<Row> empdeptjoim=empDatafields.join(deptDatafields);
		//empdeptjoim.show();
		//---------------------------------------------------------------------------------------------
		
		Dataset<Row> empdeptinnerjoim=empDatafields.join(deptDatafields,col("deptid").equalTo(col("deptin")));
		//empdeptinnerjoim.show();
		//---------------------------------------------------------------------------------------------
		
		Dataset<Row> empdeptnotrjoim=empDatafields.join(deptDatafields,col("deptid").notEqual((col("deptin"))));
		//empdeptnotrjoim.show();
		
		//---------------------------------------------------------------------------------------------
		
		System.out.println("join with aggregation");
		
		empDatafields.filter(col("age").gt(30))
		.join(deptDatafields,col("deptid")
		.equalTo(col("deptin"))).groupBy(col("deptid"))
		.agg(avg(empDatafields.col("salary")),max(empDatafields.col("age")))
		.show();
		//---------------------------------------auto-data.csv------------------------------------------------------
		
		System.out.println("uto-data.csv-");
		Dataset<Row> empDatafields2=spSession.read()
				.option("header", true)
				.csv("./dada/auto-data.csv");
		//empDatafields2.show(5);
		
		//---------------------------------------auto-data.csv------------------------------------------------------
		Row row1=RowFactory.create(1,"india","bangalore");
		Row row2=RowFactory.create(2,"usa","raston");
		
		Row row3=RowFactory.create(3,"uk","steevenscreek");
		List<Row> rlist= new ArrayList<Row>();
		rlist.add(row1);
		rlist.add(row2);
		rlist.add(row3);
		
		JavaRDD<Row> rowRDD=spContext.parallelize(rlist);
		StructType schema=DataTypes.createStructType(new StructField[] {
				DataTypes.createStructField("id", DataTypes.IntegerType, false),
				DataTypes.createStructField("country", DataTypes.StringType, false),
				DataTypes.createStructField("city", DataTypes.StringType, false),
				
		});
			
				
		Dataset<Row> textdatafields=spSession.createDataFrame(rowRDD, schema);
		textdatafields.show();
		//--------------------------------------sql-----------------------------------------------------	
		
		
		empDatafields2.createOrReplaceTempView("autos");
		
		spSession.sql("select * from autos where hp>200").show();
		System.out.println("-------------------------------------------------------------------------");
		spSession.sql("select make,max(rpm) from autos group by make").show();
		System.out.println("-------------------------------------------------------------------------");
		spSession.sql("select make,max(rpm) from autos group by make order by 2 desc").show();
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("------------------------comvert datafram to JavaRDD------------------------------------------------");
		JavaRDD<Row> autoRDd= empDatafields2.rdd().toJavaRDD();
		
		Map<String,String> jdbcconnparam= new HashMap<String,String>();
		jdbcconnparam.put("url", "jdbc:mysql://localhost:3306/munnaf");
		jdbcconnparam.put("driver", "com.mysql.jdbc.Driver");
		jdbcconnparam.put("dbtable", "emp");
		jdbcconnparam.put("user", "root");
		jdbcconnparam.put("password", "root1234");
		
		
		
		
		
		Dataset<Row> sqlDataField=spSession.read().format("jdbc").options(jdbcconnparam).load();
		sqlDataField.show();
		

		
		
	 	
	}

}
