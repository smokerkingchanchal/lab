//Q.1 WAP TO FIND FACTROIL OF ANY NUMBER (USER INPUT).

package JavaProgram;
import java.util.*;

public class factorialNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number : ");
		int num= sc.nextInt();
		
		int factorial = 1;
		
		for(int i = 1;i<=num;i++) {
			factorial*=i;
			System.out.println(factorial);
		}
		

	}

}