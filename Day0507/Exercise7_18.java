package Day0507;
/* �޼ҵ� ��: action
 * ���: �־��� ��ü�� �޼ҵ带 ȣ��
 * 		DanceRobot�� dance()�� ȣ��
 * 		SingRobot�� sing()�� ȣ��
 * 		DrawRobot�� draw()�� ȣ��
 * ��ȯ Ÿ��: ����
 * �Ű� ����: Robot r - Robot �ν��Ͻ� �Ǵ� �ڼ� �ν��Ͻ�
 */
public class Exercise7_18 {
	/* instanceof�� ��ü Ÿ���� Ȯ���ϴ� ������.
	 * ����ȯ ���ɿ��θ� Ȯ���ϸ� true / false �� ����� ��ȯ 
	 * �ַ� ��� ���迡�� �θ�ü���� �ڽİ�ü���� Ȯ���ϴµ� ���
	 * instanceof�� �⺻ ������� " ��ü instanceof Ŭ���� " �� ���������ν� ���
	 * ��! instancof�� ��ü�� �ش� Ŭ������ �ڱ����� �´��� Ȯ���� �ִ°�
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