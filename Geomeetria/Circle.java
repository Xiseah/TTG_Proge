package dev.mart.proge;

public class Circle {
	private int r;
	
	public Circle(int r) {
		this.r = r;
	}
	
	public double Area() {
		return Math.PI * r * r;
	}
	
	public double Perimeter() {
		return Math.PI * 2 * r;
	}
}
