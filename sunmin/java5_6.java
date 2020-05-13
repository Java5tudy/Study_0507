//다음은 거스름돈을 몇 개의 동전으로 지불할 수 있는지를 계산하는 문제이다. 
//변수 money의 금액을 동전으로 바꾸었을 때, 각각 몇개의 동전이 필요한지 계산하여 출력하라.
//단, 가능한 한 적은 수의 동전으로 거슬러주어야 한다.
public class java5_6 {

	public static void main(String[] args) {
		
		int[] coinUnit = {500, 100, 50, 10};

		int money = 2680;
		System.out.println("money="+money);
		
		for(int i=0; i<coinUnit.length; i++) { //코인 유닛의 길이만큼 i 반복 (4번씩) 
			
			System.out.println(coinUnit[i]+"일때");
			System.out.println(money/coinUnit[i]+"개  필요"); // 각 배열의 동전 크기가 2680에 몇번 들어가는지 계산
			 // 각배열의 동전 크기가 큰 수 부터 들어가고 남는 거스름돈 계산
			System.out.println(coinUnit[i]+"원 ," + money/coinUnit[i]+"개");
			money %= coinUnit[i];
			System.out.println("남은돈:"+money);

		}
		
	}
		
	
}


