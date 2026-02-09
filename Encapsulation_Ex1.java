package java_interview_scenarios;

class Person {

	private String name;
	private int age;
	private String country;

	Person(String name, int age, String country) {

		if (age < 0) {
			throw new IllegalArgumentException("invalid age");
		}
		this.name = name;
		this.age = age;
		this.country = country;

	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		if (age <= 0) {
			System.out.println("Age can not be negative or less than 0");
		} else {
			this.age = age;
		}
	}

	public int getAge() {
		return age;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCountry() {
		return country;
	}

}

public class Encapsulation_Ex1 {

	public void display(Person p) {

		System.out.println("\n----- Person Details ----- \n");
		System.out.println("Name    : " + p.getName());
		System.out.println("Age     : " + p.getAge());
		System.out.println("Country : " + p.getCountry());
	}

	public static void main(String[] args) {

		Person p = new Person("Harivansh", 24, "India");

		Encapsulation_Ex1 e = new Encapsulation_Ex1();
		e.display(p);

	}

}
