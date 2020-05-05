package studyJava.loopEx;

public class Exercise4_10 {
	public static void main(String[]args) {
		int num = 12345;
		int sum = 0;
		
		while(num!=0) {
			sum += num%10; //10으로 나눈 나머지 누적
			num = num/10;  // 0이될때까지 나누
		}
		System.out.println("sum = "+sum);
	}

}
