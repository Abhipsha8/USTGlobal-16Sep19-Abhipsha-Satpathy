
public class TestC {

	public static void main(String[] args) {
		Person p = new Person();
		p.name = "Abhipsha";
		p.age = 21;
		p.color = "medium";
		Person.sleep();
		System.out.println("person's name is "+p.name);
		System.out.println("person's age is "+p.age);
		System.out.println("person's color is "+p.color);

		System.out.println("********************");	

		Person p1 = new Person();
		p1.name = "Karishma";
		p1.age = 21;
		p1.color = "medium";
		Person.sleep();
		System.out.println("person's name is "+p1.name);
		System.out.println("person's age is "+p1.age);
		System.out.println("person's color is "+p1.color);




	}

}
