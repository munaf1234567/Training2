package com.exilant.day2.stats;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class darganclient {

	public static void main(String[] args) {
		List<dragons> dlist= Stream.of(
			new dragons("Errol", "usa", 15),
			new dragons("Errol", "usa", 33),
			new dragons("firnan", "usa", 5),
			new dragons("hasai", "france",12),
			new dragons("icefire", "france",3)
				
				).collect(Collectors.toList());

	Map<String,Long> nofd=dlist.stream().collect(Collectors.groupingBy(dragons::getName,Collectors.counting()));
	System.out.println(nofd);
	System.out.println("---------------------------------------");
	Map<String,Integer> sumofd=dlist.stream().collect(Collectors.groupingBy(dragons::getName,Collectors.summingInt(dragons::getCount)));
	sumofd.forEach((k,v)->{
		System.out.println("dragen name"+k+",no of dragans"+v);
	});
	//Optional<dragons> maxSalaryEmp=dlist.stream().collect(Collectors.maxBy(Collectors.minBy(Comparator.comparing(dragons::getCount)));
	Optional<dragons> maxSalaryEmp = 
			dlist.stream()
            .collect(Collectors.maxBy(Comparator.comparing(dragons::getCount)));
	System.out.println(maxSalaryEmp);
	Optional<dragons> minSalaryEmp = 
			dlist.stream()
            .collect(Collectors.minBy(Comparator.comparing(dragons::getCount)));
	System.out.println(minSalaryEmp);
	Double avgLeaves = dlist
	        .stream()
	        .collect(Collectors.averagingLong(dragons::getCount));
	System.out.println(avgLeaves);
	System.out.println("-------------------------------------------------");
	Map<String,Double> sumofdd=dlist.stream().collect(Collectors.groupingBy(dragons::getName,Collectors.averagingInt((dragons::getCount))));
	sumofdd.forEach((k,v)->{
		System.out.println("dragen name"+k+",no of dragans"+v.intValue());
	});
	System.out.println("--------------------aaaaa-------------");
	Map<String,List<dragons>> nofd1=dlist.stream().distinct().collect(Collectors.groupingBy(dragons::getCountry));
	//List<dragons> nofd1=dlist.stream().collect(Collectors.groupingBy(dragons::getCountry),Collectors.toList());
	System.out.println(nofd1);
	
	nofd1.forEach((k,v)->
	v.stream().forEach(s->{
		
	Map<String,String> m= new HashMap();
	//if(m.get(s.getName()))
	System.out.println("country--->"+s.getCountry()+"\t"+"name--->"+s.getName());
	
	}));
	
	System.out.println("--------------------------------------------");
	IntSummaryStatistics sts=dlist.stream().mapToInt((x)->x.getCount()).summaryStatistics();
	System.out.println(sts.getCount());
	System.out.println(sts.getAverage());
	System.out.println(sts.getMin());
	System.out.println(sts.getMax());
	System.out.println(sts.getSum());
	//System.out.println(nofd);
	//	System.out.println(dlist.stream().count());
		
		
		
		
		
		
	}

}
