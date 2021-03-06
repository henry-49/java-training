package labs;

public class BankAccountApp {

	public static void main(String[] args) {
		BankAccount acc = new BankAccount("327172730", 1000);
		
	}

}

 class BankAccount implements IInterest{
	// Properties of Bank Account
	 private static int iD = 1000;  // Internal ID
	 private String accountNumber; // iD + random 2-digit number + first 2 of ssn
	 private static final String routingNumber = "00790173";
	 private String name;
	 private String SSN;
	 private double balance;
	 
	 // Constructor 
	 public BankAccount(String SSN, double initDeposit) {
		 balance = initDeposit;
		 System.out.println("New Account Created");
		 this.SSN = SSN;
		 iD++;
		 setAccountNumber();
	 }
	 
	 private void setAccountNumber() {
		 // randon number to generate 2-digit number
		 int random = (int) (Math.random() * 100);
		 accountNumber = iD + "" + random + SSN.substring(0, 2);
		 System.out.println(random);
		 System.out.println("Your Account Number: "+accountNumber);
	 }
	 
	 public void setName(String name) {
		 this.name = name;
	 }
	 
	 public String getName() {
		 return name;
	 }
	 
	 public void payBills(double amount) {
		 System.out.println("Paying Bills "+amount);
		 balance = balance - amount;
		 showBalace();
	 }
	 
	 public void makeDeposit(double amount) {
		 System.out.println("Making Deposit "+amount);
		 balance = balance + amount;
		 showBalace();
	 }
	 
	 public void showBalace() {
		System.out.println("Your Balance is : "+ balance);
	 }

	@Override
	public void accrue() {
		balance = balance * (1 + rate/100);	
		 showBalace();
	}
	
	@Override
	public String toString() {
		return "[\nName: "+name+ "\nAccount# "+accountNumber+"\nRouting# "
				+routingNumber+"\nBalance: $"+balance+"\n]";
	}
}