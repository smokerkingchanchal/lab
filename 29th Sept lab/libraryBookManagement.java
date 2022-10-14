/*problem .3
Program to create library book Management system to store and display book
details in library where you can create two classes one is main another one is library, where
you can create two methods as addBook,dispanseBook and bookId,bookName,bookAuthor
as instance variables.*/

package Array;

import java.util.Objects;

class Library{
	private String bookId,bookName,bookAuther;
	public void addBook(String bookId,String bookName,String bookAuther) {
		this.bookId= bookId;
		this.bookName=bookName;
		this.bookAuther=bookAuther;
	}
	public void dispenseBook(String bookId,String bookName,String bookAuther) {
		if(Objects.equals(this.bookId, bookId) && Objects.equals(this.bookName, bookName) && Objects.equals(this.bookAuther, bookAuther)) {
			System.out.println("( "+bookId+","+bookName+","+bookAuther+") is assigned to you :");
		}
		else {
			System.out.println("sorry we don't found any book matches with your provided details");
		}
	}
}
public class libraryBookManagement {

	public static void main(String[] args) {
		Library  l = new Library();
		l.addBook("001", "java","Balagurshamy");
		l.dispenseBook("001", "java", "Balagurshamy");

	}

}