//숫자로 이루어진 문자열 str이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를 완성하라.
//만일 문자열이 "12345"라면, '1+2+3+4+5'의 결과인 15가 출력되어야 한다. 
//(1)에 알맞은 코드를 넣으시오.
//hint: String 클래스의 charAt(int i)을 사용.
public class java4_9 {

	public static void main(String[] args) { 
		String str = "12345"; 
		int sum = 0; //숫자의 합을 저장할 변수
		
		for(int i=0; i < str.length(); i++) { 
			sum += (str.charAt(i)-'0');
//String 형을 char형으로 문자 하나하나씩 받고 그걸 숫자형으로 변환하여 sum에 더함.
		} 
		System.out.println("sum="+sum); 
	}

}
