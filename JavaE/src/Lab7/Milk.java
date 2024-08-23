package Lab7;

public class Milk extends Product{
  private int volume;
  public Milk(int price) {
    super(price);
  }
  public void setVolume(int volume) {
    this.volume = volume;
  }
  public int getVolume() {
    return volume;
  }
  public String toString() {
    return "* "+getClass().getSimpleName()+" "+getVolume()+" Gram\t";
  }
  // public String toString() {
  //   return ;
  // }
}
