package com.javaex.ex04;

public class DigitThread implements Runnable{
	
	for(int i=0; i<=30; i++) {
		System.out.println(i);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
}
	
	/*
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	*/
}
