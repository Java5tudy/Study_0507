package Day0507;
/* 메소드 명: action
 * 기능: 주어진 객체의 메소드를 호출
 * 		DanceRobot은 dance()를 호출
 * 		SingRobot은 sing()를 호출
 * 		DrawRobot은 draw()를 호출
 * 반환 타입: 없음
 * 매개 변수: Robot r - Robot 인스턴스 또는 자손 인스턴스
 */
public class Exercise7_18 {
	/* instanceof는 객체 타입을 확인하는 연산자.
	 * 형변환 가능여부를 확인하며 true / false 로 결과를 반환 
	 * 주로 상속 관계에서 부모객체인지 자식객체인지 확인하는데 사용
	 * instanceof의 기본 사용방법은 " 객체 instanceof 클래스 " 를 선언함으로써 사용
	 * 즉! instancof는 객체가 해당 클래스가 자기집이 맞는지 확인해 주는것
	 */
	public static void action(Robot r) { 
		if(r instanceof DanceRobot) {
			DanceRobot D = (DanceRobot)r;
			D.dance();
//			((DanceRobot) r).dance();
		}
		else if(r instanceof SingRobot) {
			((SingRobot) r).sing();
		}
		else if(r instanceof DrawRobot) {
			((DrawRobot) r).draw();
		}
	}
	public static void main(String[] args) {
		Robot[] arr = {new DanceRobot(), new SingRobot(), new DrawRobot()};
		
		for(int i = 0; i < arr.length; i++)
			action(arr[i]);
		}
	}
class Robot {}

class DanceRobot extends Robot {
	void dance() {
		System.out.println("춤을 춥니다.");
	}
}
class SingRobot extends Robot {
	void sing() {
		System.out.println("노래를 합니다.");
	}
}
class DrawRobot extends Robot {
	void draw() {
		System.out.println("그림을 그립니다.");
	}
}