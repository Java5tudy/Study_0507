//������ ���ڸ��߱� ������ �ۼ��� ���̴�. 1�� 100������ ���� �ݺ������� �Է��Ͽ� ��ǻ�Ͱ� ������ ���� ���߸� ������ ������.
//����ڰ� ���� �Է��ϸ�, ��ǻ�ʹ� �ڽ��� ������ ���� ���ؼ� ����� �˷��ش�.
//����ڰ� ��ǻ�Ͱ� ������ ���ڸ� ���߸� ������ ������ �� �� ���� ���ڸ� ������� �˷��ش�.
//(1),(2)�� �˸��� �ڵ带 �־� ���α׷��� �ۼ��Ͻÿ�.
import java.util.Scanner;
public class java4_14 {

	public static void main(String[] args) { 
		int answer = 50;
		int input = 0;
		int count=0;
		Scanner s = new Scanner(System.in);
		
		do {
			count++;
			System.out.print("1�� 100 ������ ���� �Է��ϼ���:");
			input = s.nextInt();
			
			 if(input==answer) {
				 System.out.println("�����Դϴ�!");
				 break;
			 }
			 if(input < answer) {
				 System.out.println("�� ū ���� �Է��ϼ���.");
			 }
			 else if(input > answer) {
				 System.out.println("�� ���� ���� �Է��ϼ���.");
			 }
			
		}
		while(true); //���� �ݺ���
		System.out.println("�õ�Ƚ���� ��"+count+"�� �Դϴ�.");
	}
}