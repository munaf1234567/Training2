package com.exilant.day1;

public class lamdathread04 {

	public static void main(String[] args) {
	new Thread( new Runnable() {
		
		@Override
		public void run() {
			for(int i=0;i<5;i++)
			{
				try {
					System.out.println("thread1"+i);
					Thread.sleep(500);
					//Thread.currentThread().
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}	
		}
	}).start();

new Thread( new Runnable() {
		
		@Override
		public void run() {
			for(int i=0;i<5;i++)
			{
				try {
					System.out.println("Thread2"+i);
					Thread.sleep(500);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}	
		}
	}).start();
	
	
	}
	

}
