package Study_workshop;

import java.util.Scanner;

public class java4_1 {
	
	public static  int OperatorInt() {
		Scanner sc = new Scanner(System.in);
		int num =sc.nextInt();
		System.out.println(num);
		return num;
	}
	public static char OperatorChar() {
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		System.out.println(c);
		return c;
	}
	public static int OperatorYear() {
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
		System.out.println(y);
		return y;
	}
	public static boolean OperatorPowerOn() {
		Scanner sc = new Scanner(System.in);
		boolean p = sc.hasNext();
		System.out.println(p);
		return p;
	}
	public static String OperatorStr() {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(s);
		return s;
	}
	
	public static void main(String[] args) {
		System.out.println("1. int형 변수 x를 입력하세요.");
		int x = OperatorInt();
		if(10<x && x<20) {
			System.out.println(x+"는 10보다 크고 20보다 작다");
		}
		else {
			System.out.println(x+"는 10보다 크고 20보다 작지 않다.");
		}

		System.out.println("3. char형 변수 ch를 입력하세요.");
		char chx = OperatorChar();
		if(chx =='x' || chx =='X') {
			System.out.println(chx+"는 x 또는 X입니다.");
		}
		else {
			System.out.println(chx+"는 x 또는 X가 아닙니다.");
		}
		
		System.out.println("4. 0~9까지의 수 중 하나를 입력하세요.");
		char chnum = OperatorChar();
		if('0'<=chnum && chnum<='9') {
			System.out.println(chnum+"은 0부터 9까지의 숫자 중 하나입니다.");
		}
		else {
			System.out.println(chnum+"은 0부터 9까지의 숫자가 아닙니다.");
		}
		
		System.out.println("5. char형 영문자를 입력하세요.");
		char cap = OperatorChar(); 
		if(('A'<=cap && cap<='Z')||('a'<=cap && cap<='z')) {
			System.out.println(cap+"은 알파벳 대문자 또는 소문자 입니다.");
		}
		else {
			System.out.println(cap+"은 알파벳이 아닙니다.");
		}
		
		System.out.println("6. int형 변수 year을 입력해주세요.");
		int year = OperatorYear();
		if(((year/400==0)||(year/4==0))&&(year/100!=0)) {
			System.out.println(year+"는 400 또는 100 으로 나누어 떨어지고 100으로 나눠 떨어지지 않습니다.");
		}
		else {
			System.out.println(year+"는 400 또는 100으로 나누어 떨어지지 않습니다.");
		}
		
		System.out.println("8. yes를 입력해주세요.");
		String str = OperatorStr();
		if(str.equalsIgnoreCase("yes")) {
			System.out.println(str+"은 yes입니다.");
		}
		else {
			System.out.println(str+"은 yes가 아닙니다.");
		}
	}
}
