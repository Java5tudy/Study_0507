package JavaStudy;

class Point {
	private int xPos; //int�� Ÿ�� ���� xPos, yPos����
	private int yPos;
	@Override
	public boolean equals(Object obj) { //Object class�� equals�޼��� �������̵�
		if((xPos == ((Point)obj).xPos)  && (yPos ==((Point)obj).yPos))
			//obj�� objectŸ��. xPos���� �����ϱ� ���� Point Ÿ������ ����ȯ
			//�ּҰ��� �ƴ� ������� ���� ���ϱ� ���ؼ� �������̵�.
			return true;
		else
			return false;
	}
	public Point(int x, int y) { //Point ������, ��ǥ����
		this.xPos=x;
		this.yPos=y;
	}
}

class Rectangle { //Point��(��ǥ��) Ÿ�� ����  upperLeft�� lowerRight ����.
	private Point upperLeft; //�������(xPos��ǥ, yPos��ǥ)
	private Point lowerRight; //�����ϴ�
	@Override
	public boolean equals(Object obj) {
		if(upperLeft == ((Rectangle)obj).upperLeft) // ���������� obj�� RectangleŸ������ ����ȯ
			return true;
		if(lowerRight ==((Rectangle)obj).lowerRight)
			return true;
		else
			return false;
	}
	public Rectangle(int x1, int y1, int x2, int y2) { //4���� int�� ������ ������ �ִ� Rectangle ������.
		Point upperLeft = new Point (x1, y1);
		Point lowerRight = new Point (x2, y2);
	}
}

public class EqualsMethod {
	public static void main(String[] args) {
		
		Point upperLeft = new Point(10,7);
		Point lowerRight = new Point(10,7);
		
		if(upperLeft == lowerRight)
			System.out.println("upperLeft�� lowerRight�� �ּҰ��� �����ϴ�.");
		else
			System.out.println("upperLeft�� lowerRight�� �ּҰ��� �ٸ��ϴ�.");
		
		if(upperLeft.equals(lowerRight))
			System.out.println("upperLeft�� lowerRight�� ��ǥ�� �����ϴ�.");
		else
			System.out.println("upperLeft�� lowerRight�� ��ǥ��  �ٸ��ϴ�.");

	}

}
