package studyJava.loopEx;

public class Exercise4_15 {
	public static void main(String[]args) {
		int number = 12321;
		int tmp = number;
		int result = 0;
		
		while(tmp!=0) {
			
			result = result*10+tmp%10;
			tmp = tmp/10;
			
			System.out.println("변환값:"+result);
			System.out.println("다음값:"+tmp);
		}
		if(number==result)
			System.out.println(number+"는 회문수 입니다.");
		else
			System.out.println(number+"는 회문수가 아닙니다.");
	}
}
