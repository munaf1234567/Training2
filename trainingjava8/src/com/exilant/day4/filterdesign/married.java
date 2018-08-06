package com.exilant.day4.filterdesign;

import java.util.ArrayList;
import java.util.List;

public class married implements icriteria {

	@Override
	public List<persion> meetCriteria(List<persion> ps) {
		List<persion> malelist= new ArrayList<>();
		for(persion p:ps)
		{
			if(p.getMartialstatus().equals("married"))
			    malelist.add(p);
		}
		return malelist;
	}
	

}
