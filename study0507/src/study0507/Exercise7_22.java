package study0507;
abstract class Shape{
	Point p;
	
	Shape() {
		this(new Point(0,0));
	}
	Shape(Point p){
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
class Point {
	int x;
	int y;
	
	Point() {
		this(0,0);
	}
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "[" + x +","+y+ "]";
	}
}

class Circle extends Shape{
	double r; // 반지름
	final double PI = 3.14;
	double Area;
	
	Circle(){
	}
	Circle(Point p, double r, double Area){
		super(p);
		this.r = r;
		this.Area = Area;
	}
	double calcArea() {
		return Area = (r*r)*PI;
	}
}

class Rectangle extends Shape{
	double width;
	double height;
	double Area;
	
	Rectangle(){
		
	}
	Rectangle(Point p, double width, double height, double Area){
		super(p);
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

public class Exercise7_22 {

}
