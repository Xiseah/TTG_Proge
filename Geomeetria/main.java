package dev.mart.proge;

public class main {
	public static void main(String args[]) {
		Rect myRect = new Rect(5, 6);
		Triangle myTriangle = new Triangle(3, 7, 5);
		Circle myCircle = new Circle(10);
		
		System.out.println(myRect.Area() + "\t" + myRect.Perimeter());
		System.out.println(myTriangle.Area() + "\t" + myTriangle.Perimeter());
		System.out.println(myCircle.Area() + "\t" + myCircle.Perimeter());
	}
	
	
	
}
