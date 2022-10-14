/*4.Movie Theatre Management System, where you can create two classes one is main another one is movie, 
movie class can have two methods setMovie, getMovie where you can create movieName, movieStartTime, movieEndTime, MovieTicketPrice as instance variables.*/
package Encapsulation;
import java.util.*;
// main class
public class main {
// main method
	public static void main(String[] args) {
		
//		creating scanner class object
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Movie name : ");
//		taking input movie name
		String s = sc.next();
		System.out.println("Enter Movie start time : ");
//		taking input movie start time
		String n = sc.next();
		System.out.println("Enter Movie end time : ");
//		taking input movie end time
		String n1 = sc.next();
		System.out.println("Enter ticker price : ");
//		taking input movie price
		String n2 = sc.next();
		
//		creating movie class object
		Movie m = new Movie();
//		calling setMovie method 
		m.setMovie(s,n,n1,n2);
		
//		printing and calling getMovie method
		System.out.println(m.getMovie());

	}

}
// movie class
class Movie{
//	instance variable
	private String movieName;
	private String movieStartTime;
	private String movieEndTime;
	private String MovieTicketPrice;
//	getMovie method
	public String getMovie() {
		return movieName+" :: "+movieStartTime+":: "+movieEndTime+"::"+MovieTicketPrice;
	}
//	setMovie method
	public void setMovie(String s,String n,String n1,String n2) {
		movieName=s;
		movieStartTime=n;
		movieEndTime = n1;
		MovieTicketPrice = n2;
	}
}