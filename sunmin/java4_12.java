//구구단의 일부분을 다음과 같이 출력하시오. 2단부터 9단까지 3번째까지만 값이 나오도록.
public class java4_12 {

	public static void main(String[] args) {
		
		for(int j=1; j<4; j++) {
			for(int i=2; i<10; i++) {
				System.out.print(i+"x"+j+"="+(i*j));
				System.out.print("\t");
			}
			System.out.println();
		}

	}

}
