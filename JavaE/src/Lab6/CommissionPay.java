package Lab6;

public class CommissionPay extends Employee{
	private double gross;
	private double commision;
	public CommissionPay(String first, String last, String ssn,double gross,double com) {
		super(first, last, ssn);
		setGross(gross);
		setCommision(com);
	}
	public double getGross() {
		return gross;
	}
	public void setGross(double gross) {
		this.gross = gross;
	}
	public double getCommision() {
		return commision;
	}
	public void setCommision(double commision) {
		this.commision = commision;
	}
	public double earnings() {
		return gross*commision;
	}
	public String toString() {
		return String.format("%s\ngross sales: $%.2f; commision rate: %.2f",super.toString(), getGross(), getCommision());
	}
	
}
