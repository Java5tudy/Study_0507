package Day0507;
/* (1)
 * 클래스 명: Circle
 * 조상 클래스: Shape
 * 멤버 변수: double r - 반지름
 * 
 * (2)
 * 클래스 명: Rectangle
 * 조상 클래스: Shape
 * 멤버 변수: double width - 폭
 * 			double height - 높이
 * 메소드:
 * 	메소드 명: isSquare
 * 	기능: 정사각형인지 알려준다.
 * 	반환 타입: boolean
 * 	매개 변수: 없음	
 */

abstract class Shape {
	Point p;
	
	Shape() {
		this(new Point(0, 0));
	}
	
	double calcArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	Shape(Point p) {
		this.p = p;
	}
	
	abstract double calcArea1();
	
	Point getPosition() {
		return p;
	}
	
	void setPositoin(Point p) {
		this.p = p;
	}
}

class Point {
	int x;
	int y;
	
	Point() {
		this(0, 0);
	}
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "[" + x + "," + y + "]";
	}
}

class Circle extends Shape {
	double r;
	
	Circle(double r) {
		this(new Point(0, 0), r);
	}
	
	Circle(Point p, double r) {
	super(p);
	this.r = r;
	}
	
	@Override
	double calcArea() {
		return r * r *  Math.PI;
	}

	@Override
	double calcArea1() {
		// TODO Auto-generated method stub
		return 0;
	}
}

class Rectangle extends Shape {
	double width;
	double height;
	
	Rectangle(double width, double height) {
		this(new Point(0, 0), width, height);
	}
	
	Rectangle(Point p, double width, double height) {
		super(p);
		this.width = width;
		this.height = height;
	}
	
	@Override
	double calcArea() {
		return width * height;
	}
	
	boolean isSquare() {
		return width * height != 0 && (width == height);
	}

	@Override
	double calcArea1() {
		// TODO Auto-generated method stub
		return 0;
	}
}