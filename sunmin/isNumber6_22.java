package Study_workshop;

//import java.util.Scanner;

public class isNumber6_22 {
	
	public static boolean isNumber(String word){
		
		char tmp;
		boolean search = true;
		
		for(int i=0; i<word.length(); i++) {
			tmp = word.charAt(i);
			if(!('0'<=tmp && tmp<='9')) {
				search = false;
			}
		}
		return search;
	}

	public static void main(String[] args) {
		String str = "123";
		System.out.println(str+"는 숫자입니까?" + isNumber(str));
		
		str="1234o";
		System.out.println(str+"는 숫자입니까?"+ isNumber(str));
	}

}
