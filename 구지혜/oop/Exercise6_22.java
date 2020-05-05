package studyJava.ObjectEx;

/***
 * 다음과 같이 정의된 메서드를 작성하고 테스트 하시오
 * 메서드명 :IsNumber
 * 기능 : 주어진 문자열이 모두 숫자로만 이루어져 있는지 확인한다.
 * 		모두 숫자로만 이루어져 있으면 true를 반환하고, 그렇지 않으면 false를
 * 		반환한다. 만일 주어진 문자열이 null이거나 빈문자열 이라면 false를 반환한다.
 * 반환타입 : boolean
 * 매개변수 : String str - 검사할 문자열
 * 
 * public class Exercise6_22 {
		// IsNumber method
	public static void main(String[] args) {
		String str = "123"; // true
		System.out.println(str+"는 숫자입니까?"+isNumber(str));
		str = "1234o"; //false
		System.out.println(str+"는 숫자입니까?"+isNumber(str));
		}
	}
 * @author kate
 */

public class Exercise6_22 extends Object {
	static String str;
	
	// IsNumber method  - char charAt(int index)
	// https://coding-factory.tistory.com/73
	public static boolean isNumber (String str) {
		char[] charTostr = new char[str.length()]; // 스트링을 담을 배열
		for(int i=0;i<charTostr.length;i++){ 
			charTostr[i]=(str.charAt(i));//스트링을 한글자씩 끊어 배열에 저장
		System.out.println(charTostr[i]); //출력
		}
		return true;
	}
	
	public static void main(String[] args) {
		String str = "123"; // true
		System.out.println(str+"는 숫자입니까?"+isNumber(str));
		str = "1234o"; //false
		System.out.println(str+"는 숫자입니까?"+isNumber(str));
	}

}
	
