package studyJava.ArrayEx;

public class Exercise5_11 {

	public static void main(String[] args) {
		int[][] score = {
				{100,100,100},
				{20,20,20},
				{30,30,30},
				{40,40,40},
				{50,50,50}
		};
		
		int [][] result = new int[score.length+1][score[0].length+1];
		
		int r1 = 0, r2 = 0, r3 = 0;
		for(int i=0; i<score.length;i++) {
			int sum = 0;
			r1 += score[i][0];
			r2 += score[i][1];
			r3 += score[i][2];
			
			for(int j=0; j<score[i].length;j++) {
				sum+=score[i][j];
				System.out.printf("%5d", score[i][j]);
			}
			System.out.printf("%5d%n",sum);
		}
		int ssum=0;
		for(int[] h : score) {
			for(int i : h) {
				ssum += i;
			}
		}
		System.out.printf("%5d %4d %4d %4d%n",r1,r2,r3,ssum);
		
		for(int i=0; i<result.length;i++) {
			for(int j=0; j<result[i].length;j++) {
				System.out.printf("%4d", result[i][j]);
			}
			System.out.println();
		}
	}
}
