package com.ustglobal.objectclass;

public class USBPort {
	public static void connect(Object obj) {
		
		if(obj instanceof Mouse) {
			Mouse m = new Mouse();
			m.click();
			m.scroll();
		}else if(obj instanceof PenDrive) {
			PenDrive p = new PenDrive();
			p.read();
			p.write();
		}else {
			System.out.println("Invalid object");
		}
		
	}

}


