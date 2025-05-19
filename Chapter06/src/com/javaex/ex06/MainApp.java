package com.javaex.ex06;

public class MainApp {

	public static void main(String[] args) {
		
		Runnable dt = new DigitImpl();
		Runnable ut = new UpperImpl();
		Runnable lt = new LowerImpl();
		
		
		//출장 --> 숫자 출력
		Thread t01 = new Thread();
		t01.start();
		
		//출장 --> 대문자 "
		Thread t02 = new Thread();
		t02.start();
		
		//출장 --> 소문자 "
		Thread t03 = new Thread();
		t03.start();
		
	}

}
