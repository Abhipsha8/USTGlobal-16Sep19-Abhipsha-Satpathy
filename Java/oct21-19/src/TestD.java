
public class TestD {
	public static void main(String[] args) {
		Btm b = new Btm();
		b.swipe();
		int count = b.getCount();
		int totalcount = b.getTotalCount();
		System.out.println("Count is "+count);
		System.out.println("Count is "+totalcount);
	}

}
