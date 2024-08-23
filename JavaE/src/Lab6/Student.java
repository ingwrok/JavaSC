package Lab6;

public class Student {
  private String name;
  private int id;
  private double gpa;
  public Student(int id,String name,double gpa){
    this.id = id;
    this.name = name;
    this.gpa = gpa;
  }
  public Student(int id,double gpa){
    this.id = id;
    this.name = "";
    this.gpa = gpa;
  }
  public String getName() {
    return name;
  }
  public double getGpa() {
    return gpa;
  }
  public int getId() {
    return id;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String toString() {
    return "Student: " +"\nID: "+ id +"\nName: "+name+ "\nGPA: " + gpa;
}
}
