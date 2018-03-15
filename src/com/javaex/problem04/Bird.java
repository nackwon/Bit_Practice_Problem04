package com.javaex.problem04;

public abstract class Bird {

	protected String name;

	public void setName(String name) {
		this.name = name;
	}

	public abstract void sing();

	public abstract void fly();

	public abstract void showName();
}
// 추상클래스로 정의했다.
// sing()/fly()/showName()메소드 전부 공통되는 부분이기 때문에
// 추상메소드로 만들어 상속 받아 서브클래스에서 재정의 하면 된다.