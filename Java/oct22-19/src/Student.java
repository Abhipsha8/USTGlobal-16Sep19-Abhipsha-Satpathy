
public class Student {
	String name;
	int id;
	String bldgp;
	String sname;
	String t_name;
	public Student(String name,int id, String bldgp,String sname,String t_name) {
		this.name= name;
		this.id= id;
		this.bldgp= bldgp;
		this.sname= sname;
		this.t_name= t_name;
	}
	void printDetails() {
		System.out.println("Student name is "+name);
		System.out.println("Student id is "+id);
		System.out.println("Student bloodgroup is "+bldgp);
		System.out.println("Student School name is "+sname);
		System.out.println("Student teacher's name is "+t_name);
	}

	public static void main(String[] args) {
		Student s1 = new Student("Abhi",123,"o+","kpd","Dilip");
		Student s2 = new Student("Kari",111,"b+","bls","Basanta");
		Student s3 = new Student("Sushi",141,"b-","nas","Biranchi");
		Student s4 = new Student("Susmita",141,"o-","gud","aku");
		Student s5 = new Student("Abhaya",141,"a-","nhg","Vaishali");
		Student s6 = new Student("Rashmi",141,"a+","ijk","Sandeepa");
		Student s7 = new Student("Suranjan",141,"b-","oas","Ipsita");
		Student s8 = new Student("Sumanta",141,"b+","osa","Abhilash");
		Student s9 = new Student("Arpita",141,"ab+","oec","Kiran");
		Student s10 = new Student("Barsa",141,"ab-","ecs","Anushree");
		s1.printDetails();
		s2.printDetails();
		s3.printDetails();
		s4.printDetails();
		s5.printDetails();
		s6.printDetails();
		s7.printDetails();
		s8.printDetails();
		s9.printDetails();
		s10.printDetails();
	}

}
