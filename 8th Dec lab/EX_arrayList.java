 //Q.1 // 1. Develop a java class with a method storeEvenNumbers(int N) using ArrayList to store even numbers from 2 to N, where N is a integer which is passed as a parameter to the method storeEvenNumbers().  The method should return the ArrayList (A1) created. 
  //  2. In the same class create a method printEvenNumbers()which iterates through the arrayList A1 in step 1,  and It should multiply each number with 2 and display it in format 4,8,12….2*N. and add these numbers in a new ArrayList (A2). The new ArrayList (A2) created needs to be returned.
  //  3. Create a method retrieveEvenNumber(int N)  parameter is a number N. This method should search the arrayList (A1) for the existence of the number ‘N’ passed.  If exists it should return the Number else return zero.
package Lab_for_8_th_December;
import java.util.*;
import java.util.ArrayList;
public class EX_arrayList {
	 static ArrayList<Integer>num1=new ArrayList<Integer>();
	  static  ArrayList<Integer> num2=new ArrayList<Integer>();
	  
		static ArrayList<Integer>storeEvenNumbers(int N){
			for(int i=2;i<=N;i++) {
				if(i%2==0) {
				num1.add(i);	
				}
			}
			return num1;
		}
		
		static ArrayList<Integer> printEvenNumbers(){
			for(int i=0;i<num1.size();i++) {
				num2.add(num1.get(i)*2);
			}
			return num2;
			}
		static int retrieveEvenNumber(int N) {
			if(num1.contains(N)) {
				return N;
			}
			else
			{
				return 0;
			}
		}
		public static void main (String[]args) {
			System.out.println("First ArrayList:"+storeEvenNumbers(10));
			System.out.println("second ArrayList:"+printEvenNumbers());
			System.out.println("search Result:"+retrieveEvenNumber(6));
			}
			}