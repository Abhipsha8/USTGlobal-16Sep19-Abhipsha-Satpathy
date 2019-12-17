
public class TestB {
	static int a;
	int b;
    {
		a = 10;
		b = 20;
		System.out.println("static block 1");
	}
	TestB(){
		System.out.println("TestA() constructor");
	}
	public static void main(String[] args) {
		System.out.println("main started");
		TestB t1 = new TestB();
		TestB t2 = new TestB();
		System.out.println("main ended");

	}
    {
		a = 20;
		System.out.println("Instance block 2");
	}
    {
		a = 40;
		System.out.println(" Instanceblock 3");
	}


}
