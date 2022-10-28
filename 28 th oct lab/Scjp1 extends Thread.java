class Scjp1 extends Thread{

	public void run() {
		System.out.println("first output");
                System.out.println("enter any number");
		System.out.println("first elements");
		for (int i = 0; i<=100; i++) {
			if (i%2==0) {
				System.out.println(i);
			}
		}
	}
}

class Scjp2 extends Thread{

	public void run() {
		System.out.println("second output");
		System.out.println("second elements ")
		for (int j = 0; j <=100; j++) {
			if (j%2!=0) {
				System.out.println(j);
			}
		}
	}
}

public class ThreadTest {

	public static void main(String[] args) {

		Scjp x = new Scjp();

		Scjp1 y = new Scjp1();
		x.run();
		y.run();

	}

}