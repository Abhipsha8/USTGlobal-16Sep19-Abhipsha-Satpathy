package ustglobal.map;

import java.util.HashMap;

public class TestB {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put("abhipsha", 988800777);
		hm.put("abyaya", 98876888);
		hm.put("yapsha", 988666766);
		
		HashMap hm1 = new HashMap();
		hm.put("deepa", 944435567);
		hm.put("sushant", 97590347);
		hm.put("nigam", 955678849);
		
		boolean hasKey = hm.containsKey("abyaya");
		System.out.println("Has Key "+hasKey);
		
		boolean hasValue = hm.containsValue("abyaya");
		System.out.println("Has Key "+hasValue);
		
		hm.putAll(hm1);
		
		System.out.println("=========================");
		
		System.out.println("After put all hm1: "+hm);
		
		System.out.println(hm.size());
		
		boolean isEmpty = hm.isEmpty();
		System.out.println("Map is Empty "+isEmpty);
		
		hm.clear();
		System.out.println("After clear data:"+hm);
		
		
		
		
		
		
	}

}
