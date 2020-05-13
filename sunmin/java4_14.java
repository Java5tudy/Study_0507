//다음은 숫자맞추기 게임을 작성한 것이다. 1과 100사이의 값을 반복적으로 입력하여 컴퓨터가 생각한 값을 맞추면 게임이 끝난다.
//사용자가 값을 입력하면, 컴퓨터는 자신이 생각한 값과 비교해서 결과를 알려준다.
//사용자가 컴퓨터가 생각한 숫자를 맞추면 게임이 끝나고 몇 번 만에 숫자를 맞췄는지 알려준다.
//(1),(2)에 알맞은 코드를 넣어 프로그램을 작성하시오.
import java.util.Scanner;
public class java4_14 {

	public static void main(String[] args) { 
		int answer = 50;
		int input = 0;
		int count=0;
		Scanner s = new Scanner(System.in);
		
		do {
			count++;
			System.out.print("1과 100 사이의 값을 입력하세요:");
			input = s.nextInt();
			
			 if(input==answer) {
				 System.out.println("정답입니다!");
				 break;
			 }
			 if(input < answer) {
				 System.out.println("더 큰 수를 입력하세요.");
			 }
			 else if(input > answer) {
				 System.out.println("더 작은 수를 입력하세요.");
			 }
			
		}
		while(true); //무한 반복문
		System.out.println("시도횟수는 총"+count+"번 입니다.");
	}
}