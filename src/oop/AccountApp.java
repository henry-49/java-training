package oop;

public class AccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoanAccount la = new LoanAccount();
		
		la.increaseRate();
		la.setRate();
		la.setAmmortSchedule();
		la.setTerm(20);
		
		// polymorhism changes where we are pointing
		IRate acc1 = new LoanAccount();
		acc1.increaseRate();
		acc1.setRate();
	}

}
