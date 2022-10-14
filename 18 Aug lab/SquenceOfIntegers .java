// Q.2 write a java program to break an integer into a sequence of individual digits.
package JavaProgram;
import java.util.*;

public class SquenceOfIntegers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter a six-digit number: ");  
		 
		int number=sc.nextInt();  
		int d1=number/100000%10;   
		int d2=number/10000%10;  
		int d3=number/1000%10;  
		int d4=number/100%10;  
		int d5=number/10%10;  
		int d6=number%10;  
		//prints the digits  
		System.out.println(d1 + " " + d2 + " " + d3 + " " + d4 + " " + d5 + " " + d6);  
		}  

	}