package Lab6;

public class Graduate extends Student{
  private String thesisTitle;
  public Graduate(int id,String name,double gpa,String thesisTitle){
    super(id, name, gpa);
    setThesisTitle(thesisTitle);
  }
  public void setThesisTitle(String thesisTitle) {
    this.thesisTitle = thesisTitle;
  }
  public String getThesisTitle() {
    return thesisTitle;
  }
  public String toString() {
    return "Graduate "+super.toString()+"\nThesis: "+thesisTitle;
  }
  
}
