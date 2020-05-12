//int 타임의 변수 num이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를 완성하라. 만일 변수 num의 값이 12345라면,
//'1+2+3+4+5'의 결과인 15를 출력하라. (1)에 알맞은 코드를 넣으시오. 
//주의: 문자열로 변환하지 말고 숫자로만 처리해야한다. 
public class java4_10 {
	public static void main(String[] args) { 
		int num = 12345; 
		int sum = 0; 
		while(num > 0) {
			sum += num%10;
			num /= 10;
		}
	//출처: https://jepark3452.tistory.com/27 [JOO's note]
		//방법은 의외로 간단하다 아래와 같이 숫자를 10으로 반복해서 나눠가면서, 
		//10으로 나머지 연산을 하면 일의 자리를 얻어낼 수 있다.
		System.out.println("sum="+sum); 
	}
}
