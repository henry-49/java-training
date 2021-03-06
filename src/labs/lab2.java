package labs;

public class lab2 {

	public static void main(String[] args) {
		// Create new student
		Student std1 = new Student("Mark", "94750128");
		Student std2 = new Student("Mark", "94750128");	
		
		std1.enroll("Eng1");
		std1.enroll("Pys2");
		std1.enroll("Math2");
		
		std1.showCourses();
		std1.checkBalance();
		std1.payTution(600);
		std1.checkBalance();
		System.out.println(std1.toString());
	}

}

class Student {
	// Properties of Student
		 private static int iD = 1000;  // Internal ID
		 private String accountNumber; // iD + random 2-digit number + first 2 of ssn
		 private String userID;
		 private String name;
		 private String ssn;
		 private String email;
		 private String phone;
		 private String city;
		 private String state;
	

		private int balance = 0;
		 private String courses = "";
		 private static final int costOfCourse = 800;
		 
		 //Constructor
	 public Student(String name, String ssn) {
		// every time we create a student in our database 
		// the ID will be incremented by 1
		 iD++; 
		this.name = name;
		this.ssn = ssn;
		setUserID();
		setEmail();
	}
	 
	 private void setEmail() {
		 email = name.toLowerCase() + "."+ iD +"@heinrichhertz.de";
		 System.out.println("Your Email: "+email);
	 }
	 public String getEmail() {
		 return email;
	 }
	 public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}
		
	 private void setUserID() {
		 int max = 9000;
		 int min = 1000;
		int randNum = (int) (Math.random() * ((max - min))); 
		randNum = randNum + min;
		userID = iD +""+ randNum + ssn.substring(5);
		System.out.println(randNum);
		System.out.println("Your user id: "+userID);
		
	 }
	 
	 public void enroll(String course) {
		 this.courses = this.courses + "\n" + course;
		 System.out.println(courses);
		 balance = balance + costOfCourse;
	 }
	 
	 public void payTution(int amount) {
		 balance = balance - amount;
		 System.out.println("Tution fee payed amount $"+amount);
	 }
	 
	 public void checkBalance() {
		 System.out.println("Balance: $"+balance);
	 }
	 
	 public void showCourses() {
		 System.out.println(courses);
	 }
	 
	 public String toString() {
		 return "[\nName: "+name+ "\nCourse# "+courses+
					"\nBalance: $"+balance+"\n]";
	 }
}
