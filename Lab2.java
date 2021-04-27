package com.buzzfreeze.helloWorld;
//Lab2
public class Lab2 {  // 2.2.1
	public static String myName = "baby";
	public static void main(String[] args) {
		System.out.println("My Name is"+ " "+ myName);
		bark();
	}

	public static void bark() {
		String dogName = "Cha Cha";  //local variable
		System.out.println("The Dog Name " + dogName);
		
		
	}

}


class MyPrimativeConvrtion {  // 2.2.2
	public static void main(String[] args) {
		float myfloat = 5.3f ;
		int myInt = (int)myfloat ;
		System.out.println("My Int:" + myInt);
		
		int newInt = 4 ;
		float newfloat = newInt;
		System.out.println("My float:" + newfloat);
		
		double newDouble = 7.89d;
		float newfloatto = (float)newDouble ;
		System.out.println("My float:" + newfloatto);
		
		char nyC = 'a' ;
		int newIntto = (int)nyC;
		System.out.println("My Int:" + newIntto);
			
		
	}
}

class hello {  // 2.2.3
	public static void main(String[] args) {
		final String hello = "Hello" ;
		hello = "World";
		System.out.println(hello);
	}
}

