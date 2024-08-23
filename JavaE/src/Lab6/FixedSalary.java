package Lab6;

public class FixedSalary extends Employee{
	private double salary;
	
	public FixedSalary(String first, String last, String ssn,double s) {
		super(first, last, ssn);
		setSalary(s);
	}
//	public String getSecrurityNumber() {
//		return super.getSecrurityNumber();
//	}
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double earnings() {
		return getSalary();
	}
	public String toString() {
		return String.format("%s\nmonthly salary: $%.2f",super.toString(), getSalary());
	}
	
}
