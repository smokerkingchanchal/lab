/*Q.4Consider a scenario where Bank is a class that provides functionality to get the rate
of interest. However, the rate of interest varies according to banks. For example, SBI,
ICICI and AXIS banks could provide 8%, 7%, and 9% rate of interest.package JavaProgram;*/

package com.cognizant.shapes;

class Bank{
	float getRateOfInterest() {
		return 0;
	}
}
class SBI extends Bank{
	float getRateOfInterest() {
		return 8;
	}
}
class ICICI extends SBI{
	float getRateOfInterest() {
		return 7;
	}
}
class AXIS extends ICICI{
	float getRateOfInterest() {
		return 6;
	}
}
public class TestEg {

	public static void main(String[] args) {
		SBI s = new SBI();
		ICICI i = new ICICI();
		AXIS  a = new AXIS();
		
		System.out.println("SBI rate of interest :"+s.getRateOfInterest());
		System.out.println("ICICI rate of interest :"+i.getRateOfInterest());
		System.out.println("AXIS rate of interest :"+a.getRateOfInterest());

	}

}