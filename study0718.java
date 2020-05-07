package javastudy0507;
//������ ���� �������� �򵵷� �ڵ带 �ϼ��Ͻÿ�.
//[Hint] instanceof . �����ڸ� ����ؼ� ����ȯ�Ѵ�
//�޼���� : action
//�� �� : �־��� ��ü�� �޼��带 ȣ���Ѵ�.
//		DanceRobot�� ���, dance()�� ȣ���ϰ�,
//		SingRobot�� ���, sing()�� ȣ���ϰ�,
//		DrawRobot�� ���, draw()�� ȣ���Ѵ�.
//��ȯŸ�� : ����
//�Ű����� : Robot r - Robot�ν��Ͻ� �Ǵ� Robot�� �ڼ� �ν��Ͻ�
public class study0718 {
	public static void action(Robot r) {
		if(r instanceof DanceRobot) {        //r�� �����ϴ� �ν��Ͻ��� DanceRobot �ν��Ͻ��̰ų� 
			((DanceRobot)r).dance();   	 	 //DanceRobot�� ����ϴ� Ŭ������ �ν��Ͻ���� ���̹Ƿ� 
		}									 //��������� �� ��ȯ�� �� �� �ִ�.
		else if (r instanceof SingRobot) {
			((SingRobot)r).sing();
		}
		else if (r instanceof DrawRobot) {
			((DrawRobot)r).draw();
		}
	}
	
	public static void main(String[] args) {
		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot()};
		for(int i=0; i< arr.length;i++)
			action(arr[i]);
		} // main
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
