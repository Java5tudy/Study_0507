//다음은 주어진 문자열(value)이 숫자인지를 판별하는 프로그램이다. (1)에 알맞은 코드를 넣어서 프로그램을 완성하시오.
public class java4_13 {

	public static void main(String[] args) {
			String value = "1234"; 
			char ch = ' '; 
			boolean isNumber = true;
			
			for(int i=0; i<value.length(); i++) { //(i의 값은 0부터 시작한다.) 
				ch=value.charAt(i); //charAt(int i)메서드는 문자열에서 i번째 문자를 반환한다.
				//"12o34".charAt(2)는 문자 'o'(배열 인덱스의 2번째).
				if (!('0'<=ch && ch<='9')) { //value가 char타입의'0'-'9'사이의 값이 아니라면
					isNumber=false; //false반환
					break; //나오기
				} // break문 말고 다른 방법은 없을까?
				
			}
			if (isNumber) { //true면 숫자 출력
				System.out.println(value+"는 숫자입니다.");
			}
			else {
				System.out.println(value+"는 숫자가 아닙니다.");
			}
			
	}
	
}
