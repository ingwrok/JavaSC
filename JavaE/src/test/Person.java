package test;

public class Person {
	private String name;
	private String surname;
	private static int personCount = 0;
	public static String RecentName;
	public Person(String name, String surname) {
	this.name = name;
	this.surname = surname;
	setPersonCount(getPersonCount() + 1);
	RecentName = name;
	}
	public void Show() {
	System.out.println(name+" "+surname);
	}
	public static int getPersonCount() {
		return personCount;
	}
	public static void setPersonCount(int personCount) {
		Person.personCount = personCount;
	}
}
