package com.javaex.ex06;

public class DigitImpl implements Runnable {

	@Override
	public void run() {
		for(int i=0; i<=30; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
}
