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
		System.out.println("1. int�� ���� x�� �Է��ϼ���.");
		int x = OperatorInt();
		if(10<x && x<20) {
			System.out.println(x+"�� 10���� ũ�� 20���� �۴�");
		}
		else {
			System.out.println(x+"�� 10���� ũ�� 20���� ���� �ʴ�.");
		}

		System.out.println("3. char�� ���� ch�� �Է��ϼ���.");
		char chx = OperatorChar();
		if(chx =='x' || chx =='X') {
			System.out.println(chx+"�� x �Ǵ� X�Դϴ�.");
		}
		else {
			System.out.println(chx+"�� x �Ǵ� X�� �ƴմϴ�.");
		}
		
		System.out.println("4. 0~9������ �� �� �ϳ��� �Է��ϼ���.");
		char chnum = OperatorChar();
		if('0'<=chnum && chnum<='9') {
			System.out.println(chnum+"�� 0���� 9������ ���� �� �ϳ��Դϴ�.");
		}
		else {
			System.out.println(chnum+"�� 0���� 9������ ���ڰ� �ƴմϴ�.");
		}
		
		System.out.println("5. char�� �����ڸ� �Է��ϼ���.");
		char cap = OperatorChar(); 
		if(('A'<=cap && cap<='Z')||('a'<=cap && cap<='z')) {
			System.out.println(cap+"�� ���ĺ� �빮�� �Ǵ� �ҹ��� �Դϴ�.");
		}
		else {
			System.out.println(cap+"�� ���ĺ��� �ƴմϴ�.");
		}
		
		System.out.println("6. int�� ���� year�� �Է����ּ���.");
		int year = OperatorYear();
		if(((year/400==0)||(year/4==0))&&(year/100!=0)) {
			System.out.println(year+"�� 400 �Ǵ� 100 ���� ������ �������� 100���� ���� �������� �ʽ��ϴ�.");
		}
		else {
			System.out.println(year+"�� 400 �Ǵ� 100���� ������ �������� �ʽ��ϴ�.");
		}
		
		System.out.println("8. yes�� �Է����ּ���.");
		String str = OperatorStr();
		if(str.equalsIgnoreCase("yes")) {
			System.out.println(str+"�� yes�Դϴ�.");
		}
		else {
			System.out.println(str+"�� yes�� �ƴմϴ�.");
		}
	}
}
