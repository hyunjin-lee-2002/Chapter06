package com.javaex.ex03;

public class DigitThread extends Thread {
//숫자
	
	for(int i=0; i<30; i++) {
		System.out.println(i);
		
		try {//1초대기
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
