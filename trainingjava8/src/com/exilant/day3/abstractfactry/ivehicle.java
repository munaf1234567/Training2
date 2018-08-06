package com.exilant.day3.abstractfactry;

public interface ivehicle {
	void move();
	void speed(int maxspeed);
	void paint(icolor color);

}
class car implements ivehicle
{
	@Override
	public void move() {
	System.out.println("car moving");
		
	}

	@Override
	public void speed(int maxspeed) {
		System.out.println("max speed of car"+maxspeed);
		
	}
	
	
	@Override
	public void paint(icolor color) {
		color.paintcar();
		
	}
}
class truck implements ivehicle
{
	@Override
	public void move() {
	System.out.println("truck moving");
		
	}

	@Override
	public void speed(int maxspeed) {
		System.out.println("truck speed of car"+maxspeed);
		
	}

	@Override
	public void paint(icolor color) {
		color.paintcar();
		
	}
}