package Lab5;

public class Cashier {
	public Cashier(String name) {
		System.out.println("Pumkin Shop " + name);
	}

	public void printReceipt(InventoryCart point) {
		boolean[] check = new boolean[point.getIndex()];
		//double sum = 0;
		double sum=0;
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
}
