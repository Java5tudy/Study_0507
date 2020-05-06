package com.may07;

public class E7_18 { //������ �ٸ��� static�� �ʹ� ���� �־���.
	public static void action(Robot r) { //action�� ���� ����� ���̱� ������ static�� ������� �� ����.
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
		System.out.println("�����");
	}
}

class SingRobot extends Robot{
	static void sing() {
		System.out.println("�뷡�Ѵ�");
	}
}

class DrawRobot extends Robot{
	static void draw() {
		System.out.println("�׸��׸���");
	}
}
