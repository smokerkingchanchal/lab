//Q.2 Write a Java program to convert minutes into a number of years and days.
package JavaProgram;


public class minutesOfNumber {

	public static void main(String[] args) {
		double minutesInYear = 60 * 24 * 365;


        double min = 3456789;

        long years = (long) (min / minutesInYear);
        int days = (int) (min / 60 / 24) % 365;

        System.out.println((int) min + " minutes is approximately " + years + " years and " + days + " days");
    }

	}
