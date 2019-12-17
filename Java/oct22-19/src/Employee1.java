
public class Employee1 {
	String name;
	int eid;
	public Employee1(String name,int eid) {
		this.name=name;
		this.eid=eid;
	}
	void printDetails() {
		System.out.println("Employee name is "+name);
		System.out.println("Employee name is "+eid);
		this.sayHello();
	}
	void sayHello() {
		System.out.println("Hello "+name+" WElcome to Ust Gobal Company");
	}

	public static void main(String[] args) {
		Employee1 e1 = new Employee1("abhi",123);
		Employee1 e2 = new Employee1("kari",111);
		Employee1 e3 = new Employee1("sushi",141);
		e1.printDetails();
		e2.printDetails();
		e3.printDetails();
	}

}
