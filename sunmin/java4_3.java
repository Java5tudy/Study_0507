package JavaStudy;
//[4-3] 의 결과를 계산하시오 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10) 

public class java4_3 {

	public static void main(String[] args) {
		
		int num=0;
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=i; j++)
			num +=j;
//			System.out.println(num);
		}
		System.out.println(num);
	}
}
