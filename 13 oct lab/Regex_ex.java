/*Q.2 Write a class called MyRegex which will contain a string pattern. 
 * You need to write a regular expression and assign it to the pattern such that it can be used to validate an IP address. */
package Regex;
import java.util.regex.*;

public class Regex_ex {

	public static void main(String[] args) {
		System.out.println(result("000.12.12.034"));//case 1
		System.out.println(result("121.234.12.12"));//case 2
		System.out.println(result("000.12.234.23.23"));//case 3
		System.out.println(result("i.am.not.an.ip"));//case4
	}
		public static boolean result(String ip) {
			String zeroTo255 = "(\\d{1,2}|(0|1)\\" + "d{2}|2[0-4]\\d|25[0-5])";
			String regex = zeroTo255 + "\\."+zeroTo255+"\\."+zeroTo255+"\\."+zeroTo255;
			Pattern p = Pattern.compile(regex);
			if(ip==null) {// if empty return false
				return false;
			}
			Matcher m=p.matcher(ip);
			return m.matches();// return if the IP if matched
			
		}

	}
