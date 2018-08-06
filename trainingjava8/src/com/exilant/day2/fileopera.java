package com.exilant.day2;

import java.io.*;

public class fileopera {

	public static void main(String[] args) throws IOException {
		writetofile();
		writetofile1();
		readtofile1();
		System.out.println("--------------------------------");
		readtofile2();
	}

	
	public static void writetofile() throws IOException 
	{
		BufferedWriter br=null;
		
			try {
				br= new BufferedWriter(new FileWriter("simple.txt"));
				br.write("hello");
				br.write("hello");
				br.write("hello");
				br.write("hello");
			} catch (IOException e)
			{
				
			}

		finally
		{
			//br.flush();
			br.close();
		}
		
	}
	
	public static void writetofile1() throws IOException 
	{
		
		
			try(BufferedWriter br=new BufferedWriter(new FileWriter("simple1.txt"));) {
				
				br.write("hello");
				br.write("hello");
				br.write("hello");
				br.write("hello");
			}
		
	}
	
	public static void readtofile2() throws IOException 
	{
		
		
			try(BufferedReader br=new BufferedReader(new FileReader("simple1.txt"));) {
				
				br.lines().forEach(System.out::println);
			}
		
	}
	
	public static void readtofile1() throws IOException 
	{
		
		
			try(BufferedReader br=new BufferedReader(new FileReader("simple1.txt"));) {
				String read;
				while((read=br.readLine())!=null)
				{
					System.out.println(read);
				}
			}
		
	}
	
	
	
}
