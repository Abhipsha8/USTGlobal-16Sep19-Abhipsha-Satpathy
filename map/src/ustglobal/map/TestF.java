package ustglobal.map;

import java.util.Hashtable;

public class TestF {
	public static void main(String[] args) {
		
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(500,"ajay");
		ht.put(501,"vijay");
		ht.put(502,"sonu");
		ht.put(503,"monu");
		ht.put(504,"sriram");
		//ht.put(null,"john");NullPointerException
		//ht.put(101,null);NullPointerException
		
		
		System.out.println("Data "+ht);
		
		
	}

}
