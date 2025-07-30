package user;
class Shape{
	public int area( int side) {
		System.out.println("SQUARE");
		return side*side;
	}
	public int area(int l,int b) {
		System.out.println("RECTANGLE");
		return l*b;
		
	}
	public double area(double radius) {
		System.out.println("CIRCLE");
		return 3.14*radius*radius;
	}
}

public class Methodoverloading {
public static void main(String[] args) {
	Shape sc=new Shape();
	int squareArea=sc.area(5);
	System.out.println("area of square is"+squareArea);
	int rectangleArea=sc.area(2,3);
	System.out.println("area of rectangle is"+rectangleArea);
	double circleArea=sc.area(5.0);
	System.out.println("area of circle is"+circleArea);
}
}
