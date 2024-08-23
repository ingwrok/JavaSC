package Lab7;

public class InventoryCart {
  private Product[] proArr;
  private int index=0;
//  private int result=0;
  public InventoryCart(int size){
    proArr = new Product[size];
  }
  public void add(Product products){
    proArr[index++] = products;
    //result+=products.getPrice();

  }
  public  Product getProductAt(int index){
    return proArr[index];
  }
  public Product[] getAllProduct(){
    return proArr;
  }
  public int getIndex(){
    return index;
  }
//  public int getresult(){
//    return result;
//  }
}
