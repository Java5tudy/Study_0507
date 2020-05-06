
public class p7_22 {
	abstract class Shape {
		Point p;
		
		Shape() {
			this(new point(0,0));
			}
		Shape(Point p) {
			this.p = p;
		}
		
		
		abstract double calcArea(); //������ ������ ����ؼ� ��ȯ�ϴ� �޼���
		
		Point getPosition() {
			return p;
		}
		
		void setPosition(Point p) {
			this.p = p;
		}
	}
class Circle extends Shape{
	double r;
	Circle(double r) {
		this(new point(0,0),r);
	}
}

class Rectangle extends Sahpe{
	
}
		
		class Point {
			int x;
			int y;
			
			Point() {
				this(0,0);
			}
			
			Point(int x, int y) {
				this.x = x;
				this.y = y;
			}
			
			public String toString() {
				return "["+x+" , "+y+"]";
			}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
