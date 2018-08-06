package com.exilant.day4.observerpattern;

public class user implements IObserver{

	
	
	private IObservable obsrvl=null;
	private String name;
	
	
	
	
	
	
	public user() {
		
	}






	public user(IObservable obsrvl, String name) {
		super();
		this.obsrvl = obsrvl;
		this.name = name;
	}

public void buymobile(String s)
{
	System.out.println("hurry, i vh bought"+" "+s+" by"+name);
}


public void unsbscribe()
{
	obsrvl.remove(this);
}

	@Override
	public void update(String s) {
		buymobile(s);
		
	}

}
