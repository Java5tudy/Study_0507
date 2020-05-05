package Day0507;
/* �޼ҵ� ��: isNumber
 * ���: �־��� ���ڿ��� ��� ���ڷθ� �̷�����ִ��� Ȯ��
 * 		��� ���ڷθ� �̷���� ������ true ��ȯ
 * 		�׷��� ������ false ��ȯ
 * 		���� �־��� ���ڿ��� null�̰ų� ���ڿ� ""�̸� false ��ȯ
 * ��ȯ Ÿ��: boolean
 * �Ű� ����: String str - �˻��� ���ڿ�
 */
class Exercise6_22 {
	public static boolean isNumber(String str) {
		if(str == null || str.equals(""))
			return false;
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i); //cjarAt() 
			if(ch < '0' || ch > '9') {
				return false;
			}
		}
		return true;
		}
	public static void main(String[] args) {
		String str = "123";
		System.out.println(str + "�� �����Դϱ�?" + isNumber(str));
		
		str = "1234��";
		System.out.println(str + "�� �����Դϱ�?" + isNumber(str));
	}
}
