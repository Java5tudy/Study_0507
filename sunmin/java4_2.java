package JavaStudy;

public class java4_2 {

	public static void main(String[] args) {
		int a = 1;
		if(0<a && a<=20) {
			for(int i=0; i<20; i++) {
				if(!(i/3==0 || i/2==0)) {
					int sum=0;
					for(i=0; i<20; i++) {
						sum += i;
						//System.out.println(sum);
					}
					System.out.println(sum);
				}	
			}
		}
	}
}