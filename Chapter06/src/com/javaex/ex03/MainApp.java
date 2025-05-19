package com.javaex.ex03;

public class MainApp {
	public static void main(String []args) {
		//숫자 출장 보내서 일 시키기
		//소문자 출장 보내서 일 시키기
		//대문자 출장 보내서 일 시키기
		
		//3개 동시에 출력
		
		Thread t01 = new DigitThread();
		Thread t02 = new LowerThread();
		Thread t03 = new UpperThread();
		
		t01.start();
		t02.start();
		t03.start();
	}
}
