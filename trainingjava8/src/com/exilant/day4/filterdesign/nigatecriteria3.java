package com.exilant.day4.filterdesign;

import java.util.ArrayList;
import java.util.List;

public class nigatecriteria3 implements icriteria{

	icriteria fstcri;
	
	public nigatecriteria3(icriteria fstcri) {
		super();
		this.fstcri = fstcri;
		
	}
	
	public List<persion> meetCriteria(List<persion> ps) {
		List<persion> malelist= fstcri.meetCriteria(ps);
		//System.out.println(malelist);
		ps.removeAll(malelist);
		System.out.println("negate"+ps);
		return ps;
		
	}
	
}
