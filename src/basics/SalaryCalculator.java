package basics;

public class SalaryCalculator {

	public static void main(String[] args) {
		// Creat a variable to define our career
		
		// Declare career
		String career;
		System.out.println("Program Stating");
		
		// Define Variable
		career = "Web Developer";
		
		// Delare and Define
		int hoursPerWeek = 40;
		int weeksPerYear = 50;
		double rate = 42.50;
		
		double salary = hoursPerWeek * weeksPerYear * rate;
		System.out.println("My Salary as a "+
							career + " at the rate $"+
							rate+ "per hour is $"+ 
							salary + " per year");
		System.out.println("My Career : "+ career);
		// compute our annual salary
		// rate * hoursPerWeek * weeksPerYear

	}

}
