package studyJava.loopEx;

public class Exercise4_14 {

	public static void main(String[] args) {
		
		int answer = (int) (Math.random()*100)-1;
		int input = 0;
		int count = 0;
		
		java.util.Scanner s = new java.util.Scanner(System.in);
		
		do {
			count++;
			System.out.println("1과 100 사이의 값을 입력하세요 : ");
			input = s.nextInt();
			if(input>answer) {
				System.out.println("더 작은수를 입력하세요");
			}else if(input<answer) {
				System.out.println("더 큰수를 입력하세요");
			}else if(input == answer) {
				System.out.println("맞췄습니다.");
				System.out.println("시도횟수는"+count+"번입니다.");
				break;
			}
		} while(true);
		s.close();
	}

}
