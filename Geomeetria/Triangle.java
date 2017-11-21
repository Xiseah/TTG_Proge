package dev.mart.proge;

public class Triangle {
	
	private int a, b, c;
	
	public Triangle(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double Area() {
		double s = Perimeter() / 2.0;
		return Math.sqrt(s * (s - a) * (s-b)*(s-c));
	}
	
	public int Perimeter() {
		return a + b + c;
	}
	
}
