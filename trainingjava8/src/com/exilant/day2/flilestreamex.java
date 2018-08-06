package com.exilant.day2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class flilestreamex {

	public static void main(String[] args) throws IOException {
	
//Files.list(Paths.get(".")).map(name->Path::getFileName).forEach(System.out::println);
		//Files.list(Paths.get(".")).map(name->name.getFileName()).peek(name->System.out.println(name));
Files.list(Paths.get(".")).map(Path::getFileName).forEach(System.out::println);

//Files.list(Paths.get(".")).map(name->Path::getFileName).forEach(System.out::println);
System.err.println("----------------------------------------");
Files.list(Paths.get("."))
.map(Path::getFileName)
.map(Path::toString)
.map(String::toUpperCase)
.filter(name->name.endsWith("TXT")).sorted()
.skip(1)
.limit(3)
.forEach(name->{
	try {
		dos1(name);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
});
	}

	
	
	
//	public static void  dos(String filename) throws FileNotFoundException, IOException
//	{
//		
//		System.out.println(filename);
//		try(BufferedReader br=new BufferedReader(new FileReader(filename));) 
//		{
//			String read;
//			while((read=br.readLine())!=null)
//			{
//				//System.out.println(read);
//			String s[]=	read.split(" ");
//			for(String s1:s)
//			{
//				if(s1.equals("exilant"))
//				{
//					System.out.println(read);
//				}
//			}
//		}
//		
//	}
//	}
//	
	
	public static void  dos1(String filename) throws FileNotFoundException, IOException
	{
		
		System.out.println(filename);
		try(BufferedReader br=new BufferedReader(new FileReader(filename));) 
		{
			
			br.lines().filter(name->name.contains("exilant")).forEach(System.out::println);
			
		
	}
	}
	
	
	
	
	
	
}
