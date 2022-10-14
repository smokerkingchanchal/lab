/*problem.2
Banking Operations reate a class with customer private instance variables as
accountNumber,accountName,accountBalance and create methods as 1. create account =>
accnumber,accname,accbal 2. setAmount=> add amount to accbal 3. getAmount=>print
accbal and name account 4. withDrawAmount()=to withdraw amount from accBalance
create a main class to use customer and create atleast two customers.*/

package Array;

class customer{
	private int accountNumber;
	private String accountName;
	private double accountBalance;
	public void creatAccount(int accNum,String accName,double accBalance) {
		accountNumber = accNum;
		this.accountName = accName;
		accountBalance = accBalance;
	}
	public void setAmount(double amount) {
		accountBalance+=amount;
	}
	public void getAmount() {
		System.out.println("Account holder : "+accountName);
		System.out.println("Account balance : "+accountBalance);
	}
	public void withDrawAmount(double amount) {
		accountBalance-=amount;
		System.out.println("Withdraw of inr "+amount+"successful.\nyour updated balance is : "+accountBalance);
	}
}
public class BancAccount {

	public static void main(String[] args) {
		customer pritam = new customer();
		pritam.creatAccount(724351765, "pritam das", 15000.0);
		pritam.setAmount(14000.0);
		pritam.getAmount();
		pritam.withDrawAmount(14000.0);
		
		System.out.println(" ");
		customer tony = new customer();
		pritam.creatAccount(468130927, "tony karmakar", 18000.0);
		pritam.setAmount(14000.0);
		pritam.getAmount();
		pritam.withDrawAmount(120000.0);
		
		
		
		

	}

}