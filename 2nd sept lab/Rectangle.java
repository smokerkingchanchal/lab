/*2.you will make a class ‘Rectangle’ and declare the variable length and breadth as private.
One Constructor will be used for initializing the value of variables. When an object is created,
the constructor will be called and the default value of the instance variables will be assigned.
Now create another new class ‘RectangleTest’ & create an object of class Rectangle and
assign values of the parameter used in constructor. Calculate area of the rectangle and print
it on the console. Let’s update the new value of variable. And then read the updated value.*/


import java.util.*;
class Rectangle{
//	declaring private variable length and breadth
	private double length;
	private double breadth;
//	constructor
	 Rectangle(double d,double d1) {
		length = d;
		breadth = d1;	
	}
//	 printing output calculate area
	void Area() {
		System.out.print(length*breadth);
	}
	
}
public class RectangleTest{

	public static void main(String[] args) {
//		taking inputs
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st length :");
		double x1 = sc.nextDouble();
		System.out.print("Enter 1st breadth :");
		double y2 = sc.nextDouble();
		System.out.print("Enter 2nd length :");
		double a1 = sc.nextDouble();
		System.out.print("Enter 2nd breadth :");
		double b2 = sc.nextDouble();
//		creating objects
		Rectangle r = new Rectangle(x1,y2);
		Rectangle r1 = new Rectangle(a1,b2);
//		call the void area method
		r.Area();// printing 1st result
		r1.Area();// printing updated result

	}

}