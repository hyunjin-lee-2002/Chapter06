package com.javaex.ex06;

public class LowerImpl implements Runnable {
	//소문자
	
	@Override
	public void run() {
		for(char ch='a'; ch<='z'; ch++) {
			System.out.println(ch);
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}
}
