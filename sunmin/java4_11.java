//피보나치 수열은 앞의 두 수를 더해서 다으 수를 만들어 나가는 수열이다.
//예를 들어 앞의 두 수가 1과 1이라면 그 다음 수는 2가 되고, 그 다음수는 1과 2를 더해서 3이되어
//1, 1, 2, 3, 5, 8, 13, 21...과 같은 식으로 진행된다.
//1과 1부터 시작하는 피보나치 수열의 10번째 수는 무엇인지 계산하는 프로그램을 완성하시오. 
public class java4_11 {

	public static void main(String[] args) { 
		//수열의 시작의 첫 두 숫자를1, 1 로 한다 

		int num1 = 1; 
		int num2 = 1;
		int num3 = 0;  //세번째 값
		int sum=1; // 처음 시작하는 수가 1이여서.
		System.out.print(num1+","+num2); 
		for (int i =0 ; i <11 ; i++ ) {
			sum += num3; //sum은 맨처음(1) 부터 시작해서 계속 값이 더해서 증가하된다(+=num3).
			num1=num2; // num1에 num2를 넘긴다.
			num2=num3; //num2에 num3를 넘긴다.
			num3= num1+num2; //비어있는 num3에 num1+num2를 대입한다.
			
			
			
			}
		System.out.println("sum:"+sum);

	}

}
