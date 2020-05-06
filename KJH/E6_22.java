package com.may07;

class E6_22 {
	static boolean isNumber(String s) {
		char c;
		boolean a = false;
		if (s.equals("") || s == null) {
			a = false;
			return a;
		}
		else {
			for(int i = 0; i<s.length(); i++) {
				c = s.charAt(i);
				if ((int)c>=48 && (int)c<=57) {
					a = true;
				}
				else {
					a = false;
				}
			}return a;
		}
}
			
	
	public static void main(String[] args) {
		String str = "123";
		System.out.println("숫자니?"+isNumber(str));
		String str2 = "o";
		System.out.println("숫자니?"+isNumber(str2));
	}
	
}
