// Q.1
package String;
import java.util.*;
public class string {
	public static void main(String[] args) {
/*Problem Statement 1:
Write a program which creates a String “Welcome to Java World” and performs the following 
    • Returns the character at 5th position and display it.
    • Compares the above String with “Welcome” lexicographically ignoring case differences and display the result.
    • Concatenates “- Let us learn” to the above string and display it.
    • Returns the position of the first occurrence of character ‘a’ and display it.
    • Replaces all the occurrences of ‘a’ character with the new ‘e’ and display it.
    • Returns string between 4th position and 10th position and display it.
    • Returns the lowercase of the string and display it.
*/
		String s1 = "Welcome to java world"; // string initialization
		System.out.println("5th position charecter is : "+s1.charAt(4));// 5th position character
		String s2 = "welcome";// another string
		System.out.println(s1.compareToIgnoreCase(s2));//ignoring case and display output
		System.out.println(s1.concat("Let us learn"));
		System.out.println(s1.indexOf("a"));
		System.out.println(s1.replace("a", "e"));
		System.out.println(s1.substring(4,10));
		System.out.println(s1.toLowerCase());
/* Problem Statement 2:
Write a program which creates a StringBuffer “This is StringBuffer” and performs the following. 
    1. Adds the string ”- This is a sample program” to existing string and display it.
    2. Inserts the string “Object” into the existing string at 21st postion and display it.
    3. Reverses the entire string and displays it.
    4. Replaces the word “Buffer” with “Builder” and display it.
*/	
		StringBuffer s3 = new StringBuffer("This is stringBuffer");// initialization of string buffer
		System.out.println(s3.append("This is sample program"));// adding string buffer
		System.out.println(s3.insert(21, "Object")); // inserting
		System.out.println(s3.replace(14, 20, "Builder"));
		System.out.println(s3.reverse());// reversing the string
/* Problem Statement 3:
Write a program which creates a String “C:\IBM\DB2\PROGRAM\DB2COPY1.EXE”. It parses the string with the delimiter as ‘\’ and displays the String in the following format.
Drive: c:\
Folders: IBM || DB2 || PROGRAM 
File: DB2COPY1.EXE
*/
		StringTokenizer s4 = new StringTokenizer("C:\\IBM\\DB2\\PROGRAM\\DB2COPY1.EXE");
		System.out.println("Drive : "+s4.nextToken("\\"));
		System.out.println("Folders: "+s4.nextToken("\\"));
		System.out.println("File : "+s4.nextToken("\\"));
	}

}