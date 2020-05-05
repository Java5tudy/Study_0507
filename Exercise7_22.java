package Day0507;
/* (1)
 * Ŭ���� ��: Circle
 * ���� Ŭ����: Shape
 * ��� ����: double r - ������
 * 
 * (2)
 * Ŭ���� ��: Rectangle
 * ���� Ŭ����: Shape
 * ��� ����: double width - ��
 * 			double height - ����
 * �޼ҵ�:
 * 	�޼ҵ� ��: isSquare
 * 	���: ���簢������ �˷��ش�.
 * 	��ȯ Ÿ��: boolean
 * 	�Ű� ����: ����	
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