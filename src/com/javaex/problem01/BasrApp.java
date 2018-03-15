package com.javaex.problem01;

public class BasrApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Base base = new MyBase();
		base.service("낮");
		base.service("밤");
		base.service("오후");
	}

}
//1. MyBase클래스를 만들어 클래스를 재정의(오버라이딩)해야한다.
//2. day() 메소드 또한 출력하려는 값이 다르기 때문에 재정의 한다.
//3. afternoon() 메소드를 만들어 기능을 추가한다.

/* 
 * Base클래스를 하나도 수정하지 않고 결과 값을 내기 위해선 
 * 결과론적으로
*/