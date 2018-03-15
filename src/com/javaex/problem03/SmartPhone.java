package com.javaex.problem03;

public class SmartPhone extends MusicPhone{
	
	public void execute(String str) {
		if(str.equals("앱")) {
			appStart();
		} else if(str.equals("음악")) {
			playMusic();
		} else if(str.equals("통화")) {
			super.execute(str);
		}
	}
	
	public void appStart() {
		System.out.println("앱 실행");
	}
	
	protected void playMusic() {
		System.out.println("다운로드해서 음악 재생");
	}
}
