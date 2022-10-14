/*Q.2 In this example, you have a base class Teacher and a sub class ITTeacher. Since
class ITTeacher extends the designation and college properties and work () method from
base class, we need not to declare these properties and method in sub class.
Here we have college Name, designation and work () method which are common to all the
teachers so we have declared them in the base class, this way the child classes like Math
Teacher, Music Teacher and PhysicsTeacher do not need to write this code and can be used
directly from base class.
*/
package JavaProgram;

class Teacher{
	String collageName = "khargapur";
	String designation = "Teaching";
	
	void work() {
		System.out.println("Have great teachers");
	}
}
class ITTeacher extends Teacher{
	void show() {
		System.out.println(super.collageName+ ", " +super.designation);
		super.work();
	}
	
}
public class Testclass {

	public static void main(String[] args) {
		ITTeacher i = new ITTeacher();
		i.show();

	}

}