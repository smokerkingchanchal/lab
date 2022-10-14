/*Q.1  Write a java class to develop an employee class object using
constructor.
The constructor hold initialized the emp name & emp Id for 5 Emp
now write another class having name and from this class you have to
create 5 employee objects but
you are not allowed to use new keyword.*/

package com.cognizant.shapes;

class Employee{
	static void show(int id,String name) {
		System.out.println("Employee id : "+id+" Employee name :"+name);
	}
}
public class Employee1 {

	public static void main(String[] args) {
		Employee.show(1, "pritam");
		Employee.show(2, "rohit");
		Employee.show(3, "arnab");
		Employee.show(4, "chanchal");
		Employee.show(5, "avik");

	}

}