package com.exilant.day4.filterdesign;

import java.util.ArrayList;
import java.util.List;

public class Malemarried implements icriteria {

	@Override
	public List<persion> meetCriteria(List<persion> ps) {
		List<persion> malelist= new ArrayList<>();
		for(persion p:ps)
		{
			if(p.getSex().equals("male") && p.getMartialstatus().equals("married"))
			    malelist.add(p);
		}
		return malelist;
	}
	

}
