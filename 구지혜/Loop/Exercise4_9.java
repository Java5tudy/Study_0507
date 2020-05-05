package studyJava.loopEx;

public class Exercise4_9 {

	public static void main(String[] args) {
		String str = "12345";
		int sum = 0;
		
		for(int i=0; i<str.length();i++) {
			sum += (str.charAt(i)-'0');
			// sum += (int) str.charAt(i) > 255
			//문자열을 한글자씩 빼내 준 다음에 아스키코드'0'값을 빼준 값.
			
		}
		System.out.println("sum="+sum);

	}

}
