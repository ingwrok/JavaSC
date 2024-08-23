package Lab6;

public class Undergrad extends Student{
  private String year;
  public Undergrad(int id,String name,double gpa,String year){
    super(id, name, gpa);
    setYear(year);
  }
  public void setYear(String year) {
    this.year = year;
  }
  public String getYear() {
    return year;
  }
  public String toString() {
    return "Undergraduate "+super.toString()+"\nYear: "+year;
  }
}