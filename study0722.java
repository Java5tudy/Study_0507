package javastudy0507;
//�Ʒ��� ������ ������ ShapeŬ�����̴�.
//�� Ŭ������ �������� �ϴ� CircleŬ������  RectangleŬ������ �ۼ��Ͻÿ�. 
//�� �� �����ڵ� �� Ŭ������ �°� ������ �߰��ؾ��Ѵ�.
//(1)	Ŭ������ : Circle
//		����Ŭ���� : Shape
//		�������  : double r - ������
//(2)   Ŭ������ : Rectangle
//		����Ŭ���� : Shape
//		������� : double width - ��
//				double height - ����
//�޼��� :
//1. �޼���� : isSquare 
//	�� �� : ���簢������ �ƴ����� �˷��ش�.
//	��ȯŸ�� : boolean
//	�Ű����� : ���� 
abstract class Shape {
	Point p;
	
	Shape() {
		this(new Point(0,0));
	}
	
	Shape(Point p) {
		this.p = p;
	}
	
	abstract double calcArea(); // ������ ������ ����ؼ� ��ȯ�ϴ� �޼���

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

	Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public String toString() {
		return "["+x+","+y+"]";
	}
}

class Circle extends Shape {
	double r;
	
	Circle(double r) {
		this(new Point(0,0), r); //Circle(Point p, double r)�� ȣ��
	}
	
	Circle(Point p, double r) {
		super(p);  //������ ����� ������ �����ڰ� �ʱ�ȭ�ϵ��� �Ѵ�.
		this.r = r;
	}
	
	@Override				//?
	double calcArea() {
		return r * r * Math.PI;  
	}
}

class Rectangle extends Shape {
	double width;
	double height;
	
	Rectangle(double width, double height) {
		this(new Point(0,0), width, height);
	}
	
	Rectangle(Point p, double width, double height) {
		super(p);
		this.width = width;
		this.height = height;
	}
	
	@Override				//?
	double calcArea() {
		return width * height;
	}
	
	boolean isSquare() {
		return width * height != 0 &&(width == height);
		//width�� height�� 0�� �ƴϰ� width�� height�� ������ true�� ��ȯ�Ѵ�.
	}
}
	

//		public class study0722 {
//
//	}
//
//}
