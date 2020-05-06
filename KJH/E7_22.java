package com.may07;

abstract class Shape {
	Point p;
	
	Shape() {
		this(new Point(0,0));
	}
	
	Shape(Point p) {
		this.p = p;
	}
	
	abstract double calcArea();
	
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
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "["+x+","+y+"]";
	}
}

class Circle extends Shape {
	double r;
	Circle(double r) {
		this.r = r;
	}
	@Override
	double calcArea() {
		double a = Math.PI * r * r;
		return a;
	}
}

class Rectangle extends Shape {
	double width;
	double height;
	Rectangle(double w, double h) {
		width = w;
		height = h;
	}
	@Override
	double calcArea() {
		double a = width * height;
		return a;
	}
	boolean isSquare(double w, double h) {
		if (w == h) {
			return true;
		}
		else
			return false;
	}
	
}


public class E7_22 {
	
	static double sumArea(Shape[] s) {
		double a = 0;
		
		for (int i = 0; i<s.length; i++) {
			double b = 0;
			
			if(s[i] instanceof Circle) {
				b = s[i].calcArea();
			}
			if(s[i] instanceof Rectangle) {
				b = s[i].calcArea();
			}
			a += b;
		}
		return a;
	}
	
	public static void main(String[] args) {
		Shape[] arr = {new Circle(5.0), new Rectangle(3,4), new Circle(1)};
		System.out.println("면적의 합 : "+sumArea(arr));
	}
}
