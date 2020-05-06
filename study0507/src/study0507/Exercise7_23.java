package study0507;

abstract class Shape1{
	Point p;
	
	Shape1() {
		this(new Point(0,0));
	}
	Shape1(Point p){
		this.p = p;
	}

	abstract double calcArea(); //도형면적을 계산해서 반환하는 메서드
	
	Point getPosition() {
		return p;
	}
	void setPosition(Point p) {
		this.p = p;
	}
}
class Point1 {
	int x;
	int y;
	
	Point1() {
		this(0,0);
	}
	Point1(int x, int y){
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "[" + x +","+y+ "]";
	}
}

class Circle1 extends Shape{
	double r; // 반지름
	final double PI = 3.14;
	double Area;
	
	Circle1(){
	}
	Circle1(double r){
//		super(p);
		this.r = r;
		this.Area = Area;
	}
	double calcArea() {
		return Area = (r*r)*PI;
	}
}

class Rectangle1 extends Shape{
	double width;
	double height;
	double Area;
	
	Rectangle1(){
		
	}
	Rectangle1(double width, double height){
	//	super(p);
		this.width = width;
		this.height = height;
		this.Area = Area;
	}
	double calcArea() {
		return Area = width * height;
	}
	boolean isSquare() {
		if (width == height)
			System.out.println("정사각형");
			return true;			
	}
}
public class Exercise7_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape[] arr = {new Circle1(5.9), new Rectangle1(3,4)};
		System.out.println("모든 넓이 : " + sumArea(arr));

	}
	
	static double sumArea(Shape[] arr) {
		int sum = 0;
		for(int i = 0; i <arr.length; i++) {
			sum += arr[i].calcArea();
		}
		return sum;
	}

}
