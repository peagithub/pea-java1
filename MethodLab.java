package com.buzzfreeze.helloWorld;

public class MethodLab { // 5.
	public static void main(String[] args) {
		double e= getE();
		System.out.println("Value of e is " + e);
	}
	public static double getE () {
		return 2.78128d;
	}
}



class NotReturn {
	public static void main(String[] args) {
		System.out.println("***Start Program ***");
		for (int i = 0; i< args.length; i++) {
			System.out.println("output is" + args[i]);
		}
		System.out.println("***End the Program");
	}
}