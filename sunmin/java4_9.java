//���ڷ� �̷���� ���ڿ� str�� ���� ��, �� �ڸ��� ���� ���� ����� ����ϴ� �ڵ带 �ϼ��϶�.
//���� ���ڿ��� "12345"���, '1+2+3+4+5'�� ����� 15�� ��µǾ�� �Ѵ�. 
//(1)�� �˸��� �ڵ带 �����ÿ�.
//hint: String Ŭ������ charAt(int i)�� ���.
public class java4_9 {

	public static void main(String[] args) { 
		String str = "12345"; 
		int sum = 0; //������ ���� ������ ����
		
		for(int i=0; i < str.length(); i++) { 
			sum += (str.charAt(i)-'0');
//String ���� char������ ���� �ϳ��ϳ��� �ް� �װ� ���������� ��ȯ�Ͽ� sum�� ����.
		} 
		System.out.println("sum="+sum); 
	}

}
