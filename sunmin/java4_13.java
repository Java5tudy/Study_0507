//������ �־��� ���ڿ�(value)�� ���������� �Ǻ��ϴ� ���α׷��̴�. (1)�� �˸��� �ڵ带 �־ ���α׷��� �ϼ��Ͻÿ�.
public class java4_13 {

	public static void main(String[] args) {
			String value = "1234"; 
			char ch = ' '; 
			boolean isNumber = true;
			
			for(int i=0; i<value.length(); i++) { //(i�� ���� 0���� �����Ѵ�.) 
				ch=value.charAt(i); //charAt(int i)�޼���� ���ڿ����� i��° ���ڸ� ��ȯ�Ѵ�.
				//"12o34".charAt(2)�� ���� 'o'(�迭 �ε����� 2��°).
				if (!('0'<=ch && ch<='9')) { //value�� charŸ����'0'-'9'������ ���� �ƴ϶��
					isNumber=false; //false��ȯ
					break; //������
				} // break�� ���� �ٸ� ����� ������?
				
			}
			if (isNumber) { //true�� ���� ���
				System.out.println(value+"�� �����Դϴ�.");
			}
			else {
				System.out.println(value+"�� ���ڰ� �ƴմϴ�.");
			}
			
	}
	
}
