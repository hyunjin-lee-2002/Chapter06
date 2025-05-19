package com.javaex.ex05;

public class Main {
	public static void main (String[] args) {
		
		//make Runnable
		Runnable dt = new DigitImpl();
		// 숫자 출장
		Thread t = new Thread(dt);
		t.start();
		// 대문자 메인
		for(char ch='A'; ch<='Z'; ch++) {
			System.out.println(ch);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
