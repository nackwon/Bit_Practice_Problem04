package com.javaex.problem04;

public class Sparrow extends Bird {


	@Override
	public void sing() {
		// TODO Auto-generated method stub
		System.out.println("참새가 (" + name + ")가 소리내어 웁니다.");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("참새가 (" + name + ")가 날아 다닙니다.");
	}

	@Override
	public void showName() {
		// TODO Auto-generated method stub
		System.out.println("참새의 이름은 " + name + " 입니다.");
	}

}
