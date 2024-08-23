package Lab5;

public class Product {
  private String name;
  private String code;
  private int price;
  private int weight;
  public Product(String code,String name,int price){
    setCode(code);
    setName(name);
    setPrice(price);
  }
  public Product(int price){
    setPrice(price);
  }
  public void setCode(String code){
    this.code=code;
  }
  public void setName(String name){
    this.name=name;
  }
  public void setPrice(int price){
    this.price=price;
  }
  public String getCode(){
    return code;
  }
  public String getName(){
    return name;
  }
  public int getPrice(){
    return price;
  }
  public void setWeight(int weight) {
    this.weight = weight;
  }
  public int getWeight() {
    return weight;
  }
  public String toString(){
    return "* "+getClass().getSimpleName()+" "+getWeight()+" cc\t";
  }
  public boolean equals(Object otheroObj){
    if(this == otheroObj) return true ;
    if(otheroObj==null||!(otheroObj instanceof Product))
    return false ;
    //Product p = (Product) otheroObj;
    return (this.getClass().getName()==otheroObj.getClass().getName());
  }
}
