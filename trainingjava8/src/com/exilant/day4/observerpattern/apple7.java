package com.exilant.day4.observerpattern;

import java.util.*;

public class apple7 implements IObservable{

	private List<IObserver> users;
	private boolean isArrived=true;
	
	
	
	public apple7() {
		users= new ArrayList<IObserver>();
	}

	@Override
	public void add(IObserver observ) {
		users.add(observ);
		
	}

	@Override
	public void remove(IObserver observ) {
	users.remove(observ);
		
	}

	@Override
	public void notifyObserver() {
		for(IObserver tm:users)
		{
			tm.update(this.getClass().getSimpleName());
		}
		
	}	
		
		
		public boolean isArrive()
		{
			return isArrived;
		}
		
		
		
		public void setArrive(boolean isArrived)
		{
			this.isArrived=isArrived;
			notifyObserver();
	}

}
