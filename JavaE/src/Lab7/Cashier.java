package Lab7;


public class Cashier {
	// private String name;
	// private InventoryCart index;
	private Card card;
	private InventoryCart point;
	private double sum=0;
	public Cashier() {
		
	}
	public Cashier(String name) {
		System.out.println("Pumkin Shop " + name);
	}
	public void doPayment(InventoryCart cart,Card card) {
		point=cart;
		setCard(card);
		boolean[] check = new boolean[point.getIndex()];
		//double sum = 0;
		for (int i = 0; i < point.getIndex(); i++) {
			Product p1 = (point.getProductAt(i));
			int count = 0;
			for (int j = i; j < point.getIndex(); j++) {
				Product p2 = (point.getProductAt(j));
				if (p1.equals(p2) && !check[j]) {
					check[j] = true;
					count++;
					System.out.println();
				}
			}
			if (count != 0) {
				sum += p1.getPrice() * count;
				System.out.println(count + " " + p1.toString() + p1.getPrice() * count);
			}
		}
		System.out.println("--------------");
		System.out.println("Total : " + sum);
	}

	public void printReceipt() {
		System.out.println("\t"+getCard().getCard()); 
		System.out.println("\nPumkin Shop");
		sum -= (sum*card.discount()/100);
		System.out.println(sum);

	}
	public Card getCard() {
		return card;
	}
	public void setCard(Card card) {
		this.card = card;
	}
}
