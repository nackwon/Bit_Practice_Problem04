package com.javaex.problem04;

public class BirdApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Bird bird01 = new Duck();
	        bird01.setName("꽥꽥이");
	        bird01.fly();
	        bird01.sing();
	        bird01.showName();
	        
	        System.out.println("---------------");
	        Bird bird02 = new Sparrow();
	        bird02.setName("짹짹이");
	        bird02.fly();
	        bird02.sing();
	        bird02.showName();
	}
}
// 섞어서 클래스를 인스턴스화 하고 있기 때문에
// 슈퍼클래스의 메소드 밖에 사용을 못한다.
// 그렇기 때문에 setName()/ fly() 등은 
// 슈퍼클래스에 정의해야한다.
