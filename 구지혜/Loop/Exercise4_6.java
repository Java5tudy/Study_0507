package studyJava.loopEx;
/* 두개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 
 * 프로그램을 작성 하시오.*/
public class Exercise4_6 {

	public static void main(String[] args) {
		for (int i = 1; i<=3; i++) {
			for (int j=3; j<=5; j++) {
				if(i+j == 6) {
					int k = i+j;
					System.out.println(i+"+"+j+"="+k);
				}
			}
		}

	}

}
