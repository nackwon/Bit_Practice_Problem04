package com.javaex.problem04;

public class Duck extends Bird {

	//private String name;

	// public Duck(String name) {
	// this.name = name;
	// }

	// 이 생성자와 name 변수가 없어도 상관없다
	// 슈퍼클래스에서 name 변수의 접근제한자를 protected로 했기 때문에
	// 서브클래스에서 name 변수를 사용할 수 있다.

	public void sing() {
		System.out.println("오리가 (" + name + ")가 소리내어 웁니다.");
	}

	public void fly() {
		System.out.println("오리가 (" + name + ")가 날지 않습니다.");
	}

	public void showName() {
		System.out.println("오리의 이름은 " + name + " 입니다.");
	}
}
