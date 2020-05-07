package javastudy0507;

//������ ���� ���ǵ� �޼��带 �ۼ��ϰ� �׽�Ʈ�Ͻÿ�.
//�޼���� : isNumber
//�� �� : �־��� ���ڿ��� ��� ���ڷθ� �̷�����ִ��� Ȯ���Ѵ�.
//		��� ���ڷθ� �̷���� ������ true�� ��ȯ�ϰ� ,
//		�׷��� ������ false�� ��ȯ�Ѵ� .
//		���� �־��� ���ڿ��� null�̰ų� ���ڿ� ""�̶�� false�� ��ȯ�Ѵ�.
//��ȯŸ�� : boolean
//�Ű����� : String str - �˻��� ���ڿ�

public class study0622 {
	public static boolean isNumber(String str) {
		if ( str == null || str.equals("")) 
			return false;
	
		for ( int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i); //?
			
			
			if (ch < '0' || ch > '9') {
				return false;
			}
		}
		return true;
	}
		
	public static void main(String[] args) {
		String str = "123";
		System.out.println(str+"�� �����Դϱ� ? "+isNumber(str)); 
		
		str = "1234o";
		System.out.println(str+"�� �����Դϱ� ? "+isNumber(str));

	}

}
