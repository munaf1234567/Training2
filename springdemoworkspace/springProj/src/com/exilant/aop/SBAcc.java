package com.exilant.aop;

public class SBAcc {
	
	private Acc acc;

	public Acc getAcc() {
		return acc;
	}

	public void setAcc(Acc acc) {
		this.acc = acc;
	}

	
	
	public double showBal()
	{
		return acc.getAccbal();
	}
	@Override
	public String toString() {
		return "SBAcc [acc=" + acc + "]";
	}
	
	void getTest(int x)
	{
		System.out.println("nnnnn"+x);
	}

}
