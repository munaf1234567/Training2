package com.exilant.day4.observerpattern;


public interface IObservable {
void add(IObserver observ);
void remove(IObserver observ);
void notifyObserver();

}
