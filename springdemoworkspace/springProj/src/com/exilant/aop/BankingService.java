package com.exilant.aop;

public class BankingService {
	SBAcc sbacc;
	CAAcc2 ccacc;
	public SBAcc getSbacc() {
		return sbacc;
	}
	public void setSbacc(SBAcc sbacc) {
		this.sbacc = sbacc;
	}
	public CAAcc2 getCcacc() {
		return ccacc;
	}
	public void setCcacc(CAAcc2 ccacc) {
		this.ccacc = ccacc;
	}
	@Override
	public String toString() {
		return "BankingService [sbacc=" + sbacc + ", ccacc=" + ccacc + "]";
	}
	
	public String setandget(String name)
	{
		return "hello"+name;
	}

	
	public void throwexceptin()
	{
		int i=1;
		if(i==1)
		throw new RuntimeException("user throw exception");
		System.out.println("throwexceptin()");
	}
}
