package Lab7;


public class SavingAccount extends BaseAccount{
	private FixedSalary account;
	private Card card;
	public SavingAccount(FixedSalary account) {
		this.setAccount(account);
		String secue = account.getSecurityNumber();
		this.card = new DebitCard(secue);
	}
	public boolean deposite(double amount) {
		double deposite = account.getSalary()+amount;
		account.setSalary(deposite);
		return true;
	}
	public boolean withdraw(double amount) {
		if(account.getSalary()<amount) {
			return false;
		}else {
			double result = account.getSalary()-amount;
			account.setSalary(result);
			return true;
		}
	}
	public FixedSalary getAccount() {
		return account;
	}
	public void setAccount(FixedSalary account) {
		this.account = account;
	}
	public Card getCard() {
		return card;
	}
	public void setCard(Card card) {
		this.card = card;
	}
}
