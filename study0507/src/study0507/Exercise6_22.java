package study0507;

public class Exercise6_22 {	
	public static void main(String[] args) {
		String str = "123";
		System.out.println(str+ "�� �����Դϱ�? " + isNumber(str));
		
		String str1 = "123o";
		System.out.println(str1+ "�� �����Դϱ�? " + isNumber(str1));
	}		
		
	
	
	static boolean isNumber(String str) {
		char check;
		
		if(str.equals("")) { //���ڿ� �������� Ȯ��
			return false;
		}else { // ������ �ƴ϶�� ���ڿ� �ϳ��ϳ� Ȯ�� 
			for(int i=0; i < str.length(); i++) {
				check = str.charAt(i);
				if ((int)check < 48 || (int)check > 57) { //�ƽ�Ű �ڵ� ���� 48 ~ 57������ ���� 0���� 9
					return false; //���ڿ��� 48���ϰų� 57�̻��̸� false�� ��ȯ			
					}
				}
			return true; // �� ������ �ƴ϶��, str�� �����̹Ƿ� true ���
		}
	}
}
