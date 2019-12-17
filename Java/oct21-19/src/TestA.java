
public class TestA {
	public static void main(String[] args) {
		Pen p = new Pen();
		
		
		p.cost = 100;
		p.color = "red";
		p.brand = "cello";
		
		
		System.out.println("cost is "+p.cost);
		System.out.println("color is "+p.color);
		System.out.println("brand is "+p.brand);
		p.write();
		
		System.out.println("********************************");
		
		Van v = new Van();
		v.cost = 4000;
		v.color = "white";
		System.out.println("Van cost is "+v.cost);
		System.out.println("Van color is "+v.color);
		v.move();
		
		Van v1 = new Van();
		v1.cost = 5000;
		v1.color = "Blue";
		System.out.println("Van cost is "+v1.cost);
		System.out.println("Van color is "+v1.color);
		v1.move();
		
		

		
	}


}
