package com.exilant.day4.observerpattern;

public class client {

	public static void main(String[] args) {
	IObservable obsevl= new  oneplusst();
	IObserver user1= new user(obsevl, "kumar1");
	IObserver user2= new user(obsevl, "kumar2");
	IObserver user3= new user(obsevl, "kumar3");
	IObserver user4= new user(obsevl, "kumar4");
	obsevl.add(user1);
	obsevl.add(user2);
	obsevl.add(user3);
	obsevl.add(user4);
((oneplusst)obsevl).setArrive(true);
System.out.println("-------------------------------------");
IObservable obsevl1= new  apple7();
IObserver user11= new user(obsevl1, "kumar1");
IObserver user21= new user(obsevl1, "kumar2");
IObserver user31= new user(obsevl1, "kumar3");
IObserver user41= new user(obsevl1, "kumar4");
obsevl1.add(user11);
obsevl1.add(user21);
obsevl1.add(user31);
obsevl1.add(user41);
((apple7)obsevl1).setArrive(true);



	}

}
