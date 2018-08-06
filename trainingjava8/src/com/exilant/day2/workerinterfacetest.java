package com.exilant.day2;

public class workerinterfacetest {

	public static void main(String[] args) {
	Runner r= new Runner();
	r.execute(new workerinterface() {
		
		@Override
		public void dosomework() {
		System.out.println("workerinterface");
			
		}
	});
//using lambda exp
	r.execute(()->System.out.println("workerinterface"));

	
	r.execute(()->
	{
		
		System.out.println("one");
		System.out.println("two");
	});
	
	
	}

}
