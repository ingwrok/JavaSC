package Lab7;


public class Main {

	public static void main(String[] args) {

		FixedSalary employeeA = new FixedSalary("Clark", "Kent", "555-999-5555", 15000.00);
		SavingAccount b = new SavingAccount(employeeA);

		//System.out.println(b.getCard().getNewPassword());
		
		Milk p1 = new Milk(150);
		p1.setVolume(250);
		Sugar p2 = new Sugar(50);
		Product p3 = new Coffee(250);
		p3.setWeight(50);
		Product p4 = new Coffee(250);
		p4.setWeight(50);
		
		InventoryCart ic = new InventoryCart(10);
		ic.add(p1);
		ic.add(p2);
		ic.add(p3);
		ic.add(p4);

		Cashier c = new Cashier();
		c.doPayment(ic, employeeA.getCard());
		c.printReceipt();
		
		
	}

}
