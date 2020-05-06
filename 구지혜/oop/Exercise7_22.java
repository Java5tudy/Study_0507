package studyJava.ObjectEx;
/***
 * 아래는 도형을 정의한 Shape클래스이다. 이 클래스를 조상으로 하는 Circle클래스와
 * Rectangle 클래스를 작성하시오. 이때,생성자도 각 클래스에 맞게 적절히 추가해야 한다.
 *  (1) 클래스명 : Circle
 * 		부모클래스 : Shape
 * 		멤버변수 : double r - 반지름
 *  (2) 클래스명 : Rectangle
 *  	부모클래스 : Shape
 *  	멤버변수 : double width - 폭
 *  			double height - 높이
 *  	메서드
 *  	메서드명 : isSquare
 *  	기능 : 정사각형인지 아닌지를 알려준다.
 *  	반환타입 : boolean
 *  	매개변수 : 없음
 *  
 * @author kate
 */
class Shape{
	
}

class Circle extends Shape{
	double r;
	
	public Circle() {
		this.r = r;
	}
}
class Rectangle extends Shape{
	static double width;
	static double height;
	
	public Rectangle() {
		this.width = width;
		this.height = height;
	}
	
	boolean isSquare() {
		if (width==height) {
			return true;
		}else
			return false;
	}
}
public class Exercise7_22 {

	public static void main(String[] args) {
		Rectangle nemo = new Rectangle();
		nemo.height = 7;
		nemo.width = 8;
		System.out.println(nemo.isSquare());

	}

}
