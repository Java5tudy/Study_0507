package Day0507;
/* 메소드 명: isNumber
 * 기능: 주어진 문자열이 모두 숫자로만 이루어져있는지 확인
 * 		모두 숫자로만 이루어져 있으면 true 반환
 * 		그렇지 않으면 false 반환
 * 		만일 주어진 문자열이 null이거나 빈문자열 ""이면 false 반환
 * 반환 타입: boolean
 * 매개 변수: String str - 검사할 문자열
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
		System.out.println(str + "는 숫자입니까?" + isNumber(str));
		
		str = "1234ㅇ";
		System.out.println(str + "는 숫자입니까?" + isNumber(str));
	}
}
