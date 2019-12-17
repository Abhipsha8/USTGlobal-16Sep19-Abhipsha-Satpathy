
public class Employee {
	String name;
	int eid;
	public Employee(String ename,int eeid) {
		name= ename;
		eid= eeid;
	}
	void printDetails() {
		System.out.println("Employee name is "+name);
		System.out.println("Employee name is "+eid);
	}

	public static void main(String[] args) {
		Employee e1 = new Employee("abhi",123);
		Employee e2 = new Employee("kari",111);
		Employee e3 = new Employee("sushi",141);
		e1.printDetails();
		e2.printDetails();
		e3.printDetails();
	}

}
