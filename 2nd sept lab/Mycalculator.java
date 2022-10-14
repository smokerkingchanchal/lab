/*1. You are given a class AdvancedArithmetic which contains a method signature int
divisor_sum(int n). You need to write another class called MyCalculator which implements the
method.
divisorSum method just takes an integer as input and return the sum of all its divisors. For
example divisors of 6 are 1, 2, 3 and 6, so divisor_sum should return 12. The value of n will be at
most 1000.
Read the partially completed code in the editor and complete it. You just need to write the
MyCalculator class only. Your class shouldn't be public.*/

import java.util.*;
class AdvancedArithmetic{
//	divisor_sum method
	public int divisor_sum(int n) {
		int sum=1;
//		calculate divisor_sum
	    for(int i=2;i<=(n/2);i++){
	        if(n%i==0)sum+=i;
	    }
	    if(n!=1)return sum+n;
	    else return sum;
	}
	}

public class Mycalculator {

	public static void main(String[] args) {
//		scanner class
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number n : ");
		int n = sc.nextInt();
//		creating AdvancedArithmetic object
		AdvancedArithmetic aa = new AdvancedArithmetic();
//		creating sum value and call method dinisor_sum.
		int sum = aa.divisor_sum( n);
		System.out.println("The result is :"+sum);
		

	}

}