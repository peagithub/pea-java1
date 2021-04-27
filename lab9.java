package com.buzzfreeze.helloWorld;

public class lab9 {  //  Lab 9.	
		public static void main(String[] args) {
			for (int count = 0; count <= 20; count++ ) {
				if (count == 11) {
					System.out.println( "continue statement process" + "is" + 11 );
					continue;
				}
				
													
			}
		}
}

class moreContinue { // Lab 10.
	public static void main(String[] args) {
		for  (int moreNum = 1;  moreNum <= 10 ; moreNum++ ) {
			if (moreNum == 2) 
				continue;
			System.out.println(moreNum);
		}
		
	}
}