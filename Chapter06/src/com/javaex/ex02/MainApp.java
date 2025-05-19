package com.javaex.ex02;

public class MainApp {

	public static void main(String[] args) {
		
		//숫자출력 --> 출장 --> Thread 
		DigitThread dt = new DigitThread(); //스레드 생성
		dt.start(); //스레드 시작
		
		//문자출력 --> 메인
		for(char ch='A'; ch<='Z'; ch++) {
			System.out.println(ch);
			try {//1초대기
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}