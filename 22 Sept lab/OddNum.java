// 1.write a java program to print sum of odd numbers up to N?
package JavaProgram;
import java.util.*;
// class
public class OddNum {
	public static void main(String[] args) {
//		local variable
		int sum = 0;
//		creating scanner class object
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number :");
//		taking input number of n
		int n = sc.nextInt();
		System.out.println("Sum of odd numbers are :");
		
		for(int i = 1; i<n;i++) {
			if (i%2!=0) {
				sum = sum+i;
				System.out.println(sum);
			}
		}

	}

}