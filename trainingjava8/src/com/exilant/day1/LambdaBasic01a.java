package com.exilant.day1;

import java.util.*;
import java.util.List;
import java.util.function.Consumer;

public class LambdaBasic01a {

	public static void main(String[] args) {
		List<Integer> nums=Arrays.asList(10,20,30,40,50,60);
		//till <jdl1.5
		System.out.println("b4 jdk1.5");
		int sum=0;
		for(int i=0;i<nums.size();i++)
		{
			System.out.println(nums.get(i));
			sum=sum+nums.get(i);
		}
		System.out.println("sum->"+sum);
       //till jdk1.7
		System.out.println("till jdk1.7");
		int sum2=0;
		for(Integer nm:nums)
		{
			System.out.println(nm);
			sum2+=+nm*2;
		}
		System.out.println("sum2->"+sum2);
		System.out.println("afterjdk1.7 lamda");
		
		
		
		
	}

}
