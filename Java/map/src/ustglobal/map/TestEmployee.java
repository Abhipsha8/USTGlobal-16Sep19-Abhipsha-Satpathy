package ustglobal.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestEmployee {
	public static void main(String[] args) {
		Employee e1 = new Employee(2,"abhipsha",679999);
		Employee e2 = new Employee(3,"Roni",659999);
		Employee e3 = new Employee(4,"Tikili",669999);
		Employee e4 = new Employee(5,"Anada",689999);
		Employee e5 = new Employee(6,"Midii",699999);
		Employee e6 = new Employee(7,"Tutu",609999);
		Employee e7 = new Employee(8,"Liza",799999);
		Employee e8 = new Employee(9,"Anshu",899999);
		Employee e9 = new Employee(10,"Sneha",599999);
		
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		
		ArrayList<Employee> al1 = new ArrayList<Employee>();
		al1.add(e4);
		al1.add(e5);
		al1.add(e6);
		
		ArrayList<Employee> al2 = new ArrayList<Employee>();
		al1.add(e7);
		al1.add(e8);
		al1.add(e9);
		
		HashMap<String, ArrayList<Employee>> hm = new HashMap<>();
		hm.put("first",al);
		hm.put("second",al1);
		hm.put("third",al2);
		
		ArrayList<Employee> first = hm.get("second");
		
		Iterator<Employee> it = first.iterator();
		while(it.hasNext()) {
			Employee e = it.next();
			System.out.println("Id is "+e.id);
			System.out.println("Name is "+e.name);
			System.out.println("Salary is "+e.salary);
			System.out.println("===========================");
		}
		
		
	}
	

}
