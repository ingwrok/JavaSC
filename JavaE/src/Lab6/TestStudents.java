package Lab6;

public class TestStudents {
  public static void main(String[] args) {
    Student s1 = new Student(97000,"Sameer",3.51);
    Student s2 = new Student(98000,3.22);
    Undergrad u1 = new Undergrad(99000,"Shahid",2.91,"Junior");
    Graduate g1 = new Graduate(20000,"Mubin",3.57,"Alogorithms and Complexity");

    System.out.println(s1);
    System.out.println(s2);
    System.out.println(u1);
    System.out.println(g1);
  }
}
