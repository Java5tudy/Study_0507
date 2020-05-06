
public class p6_22 {
	static boolean isNumber(String str) {



		if (str == null)

			return false;



		for (int i = 0; i < str.length(); i++) {

			if (str.equals("")) {


				

				return false;

			} else if (str.charAt(i) < '0' || str.charAt(i) > '9') // or 

				return false;

		}

		return true;
	}

	public static void main(String[] args) {
		String str = "465064406";
		System.out.println(str + "는 숫자입니까?" + isNumber(str));
		
		 str = "1234ㅇ";
		System.out.println(str + "는 숫자입니까?" + isNumber(str));
	}

}
