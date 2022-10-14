// WAP TO DRAW THE PATTERN.

package JavaProgram;
import java.util.*;

public class PatternProgram {

	public static void main(String[] args) {
//		initialize variables
		
		int i,j,k,l;
//		input Scanner
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		
		for(i = 1;i<=num;i++) {
			for(j = num;j>=i;j--) {
				System.out.print(" ");//this two loops will print space
			}
			for( k = 1;k<=i;k++) {
				System.out.print("*");// this loops print *
			}
			for( l = 2;l<=i;l++) {
				System.out.print("*");// and this loop also
			}
			System.out.println();// print end line
		}
    } 


		

	}
