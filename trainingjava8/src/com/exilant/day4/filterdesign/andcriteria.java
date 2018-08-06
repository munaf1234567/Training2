package com.exilant.day4.filterdesign;

import java.util.ArrayList;
import java.util.List;

public class andcriteria implements icriteria{

	icriteria fstcri;
	icriteria sectcri;
	public andcriteria(icriteria fstcri, icriteria sectcri) {
		super();
		this.fstcri = fstcri;
		this.sectcri = sectcri;
	}
	
	public List<persion> meetCriteria(List<persion> ps) {
		List<persion> malelist= fstcri.meetCriteria(ps);
		return sectcri.meetCriteria(malelist);
		
	}
	
}
