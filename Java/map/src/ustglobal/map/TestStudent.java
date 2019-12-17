package ustglobal.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestStudent {
	public static void main(String[] args) {
		Student s1 = new Student(2,"abhipsha",67.9);
		Student s2 = new Student(3,"Roni",65.9);
		Student s3 = new Student(4,"Tikili",66.9);
		Student s4 = new Student(5,"Anada",68.9);
		Student s5 = new Student(6,"Midii",69.9);
		Student s6 = new Student(7,"Tutu",60.9);
		Student s7 = new Student(8,"Liza",79.9);
		Student s8 = new Student(9,"Anshu",89.9);
		Student s9 = new Student(10,"Sneha",59.9);
		
		
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		ArrayList<Student> al1 = new ArrayList<Student>();
		al1.add(s4);
		al1.add(s5);
		al1.add(s6);
		
		ArrayList<Student> al2 = new ArrayList<Student>();
		al1.add(s7);
		al1.add(s8);
		al1.add(s9);
		
		HashMap<String, ArrayList<Student>> hm = new HashMap<>();
		hm.put("first",al);
		hm.put("second",al1);
		hm.put("third",al2);
		
		ArrayList<Student> first = hm.get("second");
		
		Iterator<Student> it = first.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println("Id is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("Percentage is "+s.percentage);
			System.out.println("===========================");
		}
		
	}
}
