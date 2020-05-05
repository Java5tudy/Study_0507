package studyJava.ArrayEx;

public class Exercise5_10 {

	public static void main(String[] args) {
		char[] abcCode = {'`','~','!','@','#','$','%','^','&','*','(',')',',',
				'-','_','+','=','|','[',']','{','}',';',':','.','/'};
		char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};
		
		String src = "abc123";
		String result = "";
		
		for (int i=0; i<src.length();i++) {
			char ch = src.charAt(i);
			if(ch==0x61||ch==0x62||ch==0x63) {
				result += abcCode[i];
			}else if(ch==0x31 ||ch==0x32|| ch<=0x33) {
				result +=numCode[i-2];
			}

		}
		
		System.out.println("src : "+src);
		System.out.println("result : "+result);

	}

}
