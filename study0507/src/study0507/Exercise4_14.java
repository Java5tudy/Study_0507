package study0507;

import java.util.Scanner;

public class Exercise4_14 {
	public static void main(String[] args) {
		int answer = (int)(Math.random()*100)+1;
		int input = 0;
		int count = 0;
		
		Scanner S = new Scanner(System.in);
		
		do {
			count++;
			System.out.println("1과 100사이의 값을 입력하세요 : ");
			input = S.nextInt();
			
			if(input != answer) {
				continue;
			}else {
				break;
			}
		}while (true);
		System.out.println("맞췄습니다.");
		System.out.println("시도횟수는 "+ count +"번입니다.");
	}
}
