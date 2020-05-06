package study0507;

public class Exercise6_22 {	
	public static void main(String[] args) {
		String str = "123";
		System.out.println(str+ "는 숫자입니까? " + isNumber(str));
		
		String str1 = "123o";
		System.out.println(str1+ "는 숫자입니까? " + isNumber(str1));
	}		
		
	
	
	static boolean isNumber(String str) {
		char check;
		
		if(str.equals("")) { //문자열 공백인지 확인
			return false;
		}else { // 공백이 아니라면 문자열 하나하나 확인 
			for(int i=0; i < str.length(); i++) {
				check = str.charAt(i);
				if ((int)check < 48 || (int)check > 57) { //아스키 코드 값이 48 ~ 57까지가 숫자 0에서 9
					return false; //문자열이 48이하거나 57이상이면 false를 반환			
					}
				}
			return true; // 위 조건이 아니라면, str은 숫자이므로 true 출력
		}
	}
}
