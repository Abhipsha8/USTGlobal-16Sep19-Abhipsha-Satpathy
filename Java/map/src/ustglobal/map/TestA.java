package ustglobal.map;

import java.util.HashMap;

public class TestA {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put("abhipsha", 988800777);
		hm.put("abyaya", 98876888);
		hm.put("yapsha", 988666766);
		hm.put(null, 988666766);
		hm.put(null, 98868111);
		
		System.out.println("Data :"+hm);
		
		hm.put("abhipsha", 9866990);
		System.out.println("After modify"+hm);
		
		hm.put("rashmi", 9866990);
		System.out.println("After modify"+hm);
		
		System.out.println("After null"+hm);
		System.out.println("================");
		System.out.println("After adding duplicate null");
		System.out.println(hm);
		Object phoneno = hm.get("abhipsha");
		System.out.println("value "+phoneno);
		
		System.out.println("================");
		
		Object phoneno1 = hm.get("susmita");
		System.out.println("value "+phoneno1);
		
		Object value = hm.remove("abhipsha");
		System.out.println("value "+value);
		
		System.out.println("After removing "+hm);
		
	}

}
