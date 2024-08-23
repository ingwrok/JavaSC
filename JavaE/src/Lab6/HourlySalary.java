package Lab6;

public class HourlySalary extends Employee{
	private  double pay;
	private double perWork;
	public HourlySalary(String first, String last, String ssn,double pay,double perWork) {
		super(first,last,ssn);
		setPay(pay);
		setPerWork(perWork);
	}
	public double getPay() {
		return pay;
	}
	public void setPay(double pay) {
		this.pay = pay;
	}
	public double getPerWork() {
		return perWork;
	}
	public void setPerWork(double perWork) {
		this.perWork = perWork;
	}
	public double earnings() {
		return pay*perWork;
	}
	 public String toString() {
		return String.format("%s\nhourly pay: $%.2f; hours worked: %.2f",super.toString(), getPay(), getPerWork());
	 }
}
