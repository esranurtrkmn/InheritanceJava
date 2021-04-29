package kodlamaioProject;

public class Instructor extends User {

	double salary;

	public Instructor() {
		
	}
	
	public Instructor(int id, String firstName, String lastName, String eMail, double salary) {
		super(id, firstName, lastName, eMail);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
