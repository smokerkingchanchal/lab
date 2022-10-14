/*Q.3 Can you create object of a class from inside the scope of
another class constructor.*/
// Ans : yes. 

package com.innovation.geometry;

class test1{
	
}
public class test {
	test(){
		test1 t = new test1();
//		here creating object of test1 class
	}
	public static void main(String[] args) {
		test t1 = new test();
	}

}