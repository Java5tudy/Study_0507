package com.may07;

public class E7_18 { //문제와 다르게 static으로 바로 
	public static void action(Robot r) { //action은 내가 만드는 것이기 때문에 static은 상관없을 것 같다.
		if(r instanceof DanceRobot) {
			DanceRobot.dance();
		}
		if(r instanceof SingRobot) {
			SingRobot.sing();
		}
		if(r instanceof DrawRobot) {
			DrawRobot.draw();
		}
		}
	
	public static void main(String[] args) {		
		Robot[] arr = {new DanceRobot(), new SingRobot(), new DrawRobot()};
		
		for (int i = 0; i < arr.length; i++) {
			action(arr[i]);
		}
	}
}

class Robot {}

class DanceRobot extends Robot{
	static void dance() {
		System.out.println("춤춘다");
	}
}

class SingRobot extends Robot{
	static void sing() {
		System.out.println("노래한다");
	}
}

class DrawRobot extends Robot{
	static void draw() {
		System.out.println("그림그린다");
	}
}
