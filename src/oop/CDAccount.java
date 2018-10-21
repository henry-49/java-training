package oop;

public class CDAccount extends BankAccount implements IRate{
	String intrestRate;
	
	void compound() {
		System.out.println("compounding intrestRate");
	}

}
