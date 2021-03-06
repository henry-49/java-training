package oop;

public class BankAccountApp {

	public static void main(String[] args) {

		BankAccount acc1 = new BankAccount();
		//acc1.accountNumber = "1093847";
		acc1.setName("Markus");
		acc1.setAccountNumber("7836464");
		acc1.deposit(1000);
		acc1.withdraw(1200);
		
		// polymorphism through overriding
		System.out.println(acc1.toString());
		
		
		
		// polymorphism through overloading
		BankAccount acc2 = new BankAccount("Checking Account");
		acc2.setAccountNumber("109039302");
		BankAccount acc3 = new BankAccount("Savings Account", 5000);
		acc3.setAccountNumber("109039302");

	}

}
