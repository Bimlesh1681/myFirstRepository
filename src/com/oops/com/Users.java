package com.oops.com;

import java.util.ArrayList;

public class Users {

	String name;
	int id;
	String deviceList[];
	ArrayList<String> orderHistory;
	
	public static void main(String[] args) {
		
		Users u1 = new Users();
		
		u1.name="Bimlesh";
		u1.id = 1001;
		
		u1.deviceList = new String[3];
		u1.deviceList[0] = "Samsung Note 9";
		u1.deviceList[1] = "iPhone 12 Pro";
		u1.deviceList[2] = "Motorola";
		
		u1.orderHistory = new ArrayList<String>();
		u1.orderHistory.add("Nike");
		u1.orderHistory.add("Puma");
		u1.orderHistory.add("JBL");
		
		System.out.println("data stored in the Users class are: ");
		System.out.println(u1.name+" "+u1.id);
		
		for(int i=0;i<u1.deviceList.length;i++)
		{
			System.out.println(u1.deviceList[i]);
		}
		
		System.out.println(u1.orderHistory);

	}

}
