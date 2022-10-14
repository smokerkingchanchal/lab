/*2. Write a java program to illustrate Calculator class with addition, subtraction, multiplication methods
 * that can take any number of parameters to perform the operation, without using method/constructor overloading.*/
package JavaProgram;
import java.util.*;
// class
public class Calculator {
// main method
	public static void main(String[] args) {
//		creating scanner class object
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
//		taking input first number
		double num1 = sc.nextDouble();
		System.out.println("Enter second number :");
//		taking input second number
		double num2 = sc.nextDouble();
		
		System.out.println("Addition :"+addition(num1,num2));// print addition number
		System.out.println("Subtraction :"+subtraction(num1,num2));// print subtraction number
		System.out.println("Multiplication :"+multiplication(num1,num2));// print multiplication number

	}
//	 addition method
    public static double addition(double num1,double num2) {
		return num1+num2;
	}
//    subtraction method
	public static double subtraction(double num1,double num2) {
		return num1-num2;
	}
//	 multiplication method
	public static double multiplication(double num1,double num2) {
		return num1*num2;
	}

}