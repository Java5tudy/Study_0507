package study0507;
/*
 *  action �޼��带 �ۼ�/
 */

public class Exercise7_18 {
	
	public static void main(String[] args) {
		Robot[] arr = {new DanceRobot(), new SingRobot(), new DrawRobot()};
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print("arr["+ i +"] : ");
			action(arr[i]);
		}
	}
	public static void action(Robot r) {
		if(r instanceof DanceRobot) {
			((DanceRobot) r).dance();
		}else if(r instanceof SingRobot) {
			((SingRobot) r).sing();
		}else if(r instanceof DrawRobot){
			((DrawRobot) r).draw();
		}
	}
}

class Robot{}

class DanceRobot extends Robot {
	void dance() {
		System.out.println("���� ��ϴ�.");
	}
}
class SingRobot extends Robot {
	void sing() {
		System.out.println("�뷡�� �մϴ�.");
	}
}
class DrawRobot extends Robot {
	void draw() {
		System.out.println("�׸��� �׸��ϴ�.");
	}
}