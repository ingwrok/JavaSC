package Lab5;

public class Main {
  public static void main(String[] args) {
    // Product p1 = new Product("XA1101","Milk",150);
    // Product p2 = new Product("XA1102","Sugar",50);
    // Product p3 = new Product("XA1103","Coffee",250);

    // InventoryCart ic = new InventoryCart(10);
    // ic.add(p1);
    // ic.add(p2);
    // ic.add(p3);
    // //System.out.println(ic.getAllProduct()[0].getProduct());
    // Cashier c = new Cashier("John Doe");
    // c.printReceipt(ic);

    //new
    Milk p1 = new Milk(150);
    p1.setVolume(250);
    Sugar p2 = new Sugar(50);
    p2.setWeight(250);
    Product p3 = new Coffee(250);
    p3.setWeight(50);
    Product p4 = new Coffee(250);
    p4.setWeight(50);
    System.out.println(p3.equals(p4));
    InventoryCart ic = new InventoryCart(10);
    ic.add(p1);
    ic.add(p2);
    ic.add(p3);
    ic.add(p4);
     Cashier c = new Cashier("John Doe");
    c.printReceipt(ic);
  }
}
