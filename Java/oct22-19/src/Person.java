
public class Person {
	String name;
	int age;

	Person(String pname, int page){
		name= pname;
		age= page;
	}
	void printDetails() {
		System.out.println("Person name is "+name);
		System.out.println("Person name is "+age);
	}
	public static void main(String[] args) {
		Person p1 = new Person("abhi",21);
		Person p2 = new Person("abhi",21);
		Person p3 = new Person("abhi",21);
		p1.printDetails();
		p2.printDetails();
		p3.printDetails();
	}

}
