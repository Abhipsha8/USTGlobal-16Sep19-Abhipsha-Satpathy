
public class TestA {
	public static int add(int a,int b) {
		System.out.println("add (int a , int b)method");
		return a+b;
	}
	public static long add(long a,int b) {
		System.out.println("add (long a , int b)method");
		return a+b;

	}
	public static void add(int a,byte b) {
		System.out.println("add (int a , byte b)method");
	}
	public  long multiply(long a,int b) {
		System.out.println("add (long a , int b)method");
		return a*b;

	}
	public  int multiply(int a,byte b) {
		System.out.println("add (int a , byte b)method");
		return a*b;
	}
	public static void main(String[] args) {
		System.out.println("main(String[] args)");
		main(10);
		add(12,12);
		add(234,23);
		TestA t = new TestA();
		t.multiply(23, 88);
		t.multiply(24, 89);

	}
	public static void main(int a) {
		System.out.println("main(int a) method");

	}


}
