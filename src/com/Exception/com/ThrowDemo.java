package com.Exception.com;

public class ThrowDemo {

	public static void main(String[] args) {

		try {
			throw new Exception("My throw exception");
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
