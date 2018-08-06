package com.exilant.day1;

import java.util.Arrays;
import java.util.*;
import java.util.List;

public class custsortmulipleflds {

	public static void main(String[] args) {
		List<customer> cs=Arrays.asList(
				new customer(101, "Ramu", 6000, "eng"),
				new customer(102, "Ramu", 6500, "dev"),
				new customer(103, "Poja", 4500, "lead"),
				new customer(104, "Poja", 4500, "eng"),
				new customer(105, "Rtanmay", 4000, "dev"),
				new customer(106, "Raju", 2000, "dev"));
				
		
		cs.forEach(System.out::println);
System.out.println("---------------------------------------------------");
Comparator<customer> sortByFirstName = (p, o) ->p.getCname().compareTo(o.getCname());
Comparator<customer> sortBydeg = (p, o) -> p.getDesignation().compareTo(o.getDesignation());
Comparator<customer> sortBypur = (p, o) -> (int)(p.getCparches()-o.getCparches());
			
 cs.stream()
.sorted(sortByFirstName.thenComparing(sortBydeg).thenComparing(sortBypur) )
.forEach(person->System.out.println(person));


	}

}
