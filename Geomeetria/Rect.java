package dev.mart.proge;

public class Rect {
	
	private int a, b;
	
	public Rect(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int Area() {
		return a * b;
	}
	
	public int Perimeter() {
		return 2 * (a + b);
	}
	
}
