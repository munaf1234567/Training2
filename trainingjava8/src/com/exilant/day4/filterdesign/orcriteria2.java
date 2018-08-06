package com.exilant.day4.filterdesign;

import java.util.ArrayList;
import java.util.List;

public class orcriteria2 implements icriteria{

	icriteria fstcri;
	icriteria sectcri;
	public orcriteria2(icriteria fstcri, icriteria sectcri) {
		super();
		this.fstcri = fstcri;
		this.sectcri = sectcri;
	}
	
	public List<persion> meetCriteria(List<persion> ps) {
		List<persion> malelist= fstcri.meetCriteria(ps);
		System.out.println(malelist);
		
		List<persion> marriagelist=sectcri.meetCriteria(malelist);
		System.out.println(marriagelist);
		for(persion p:marriagelist)
		{
			if(!malelist.contains(p))
			{
				malelist.add(p);
			}
		    }
	
		return malelist;
		
	}
	
}
