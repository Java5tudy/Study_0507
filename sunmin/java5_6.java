//������ �Ž������� �� ���� �������� ������ �� �ִ����� ����ϴ� �����̴�. 
//���� money�� �ݾ��� �������� �ٲپ��� ��, ���� ��� ������ �ʿ����� ����Ͽ� ����϶�.
//��, ������ �� ���� ���� �������� �Ž����־�� �Ѵ�.
public class java5_6 {

	public static void main(String[] args) {
		
		int[] coinUnit = {500, 100, 50, 10};

		int money = 2680;
		System.out.println("money="+money);
		
		for(int i=0; i<coinUnit.length; i++) { //���� ������ ���̸�ŭ i �ݺ� (4����) 
			
			System.out.println(coinUnit[i]+"�϶�");
			System.out.println(money/coinUnit[i]+"��  �ʿ�"); // �� �迭�� ���� ũ�Ⱑ 2680�� ��� ������ ���
			 // ���迭�� ���� ũ�Ⱑ ū �� ���� ���� ���� �Ž����� ���
			System.out.println(coinUnit[i]+"�� ," + money/coinUnit[i]+"��");
			money %= coinUnit[i];
			System.out.println("������:"+money);

		}
		
	}
		
	
}


