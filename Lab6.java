package com.buzzfreeze.helloWorld;
// 6.
public class Lab6 {  //6.1.
	public static void main(String[] args) {
		int i = 1 ;
		while (i<= 10) {
			System.out.println("i:"+" " +i);
			i++;
		}
	}

}


class myNum {  // 6.2
	public static void main(String[] args) {
		int num =0;
		int j  = 1;
		while (j<=10) {
			num += j++;
			
		}
		
		System.out.println(num);
	}
}

class mySolution { // 6.3
	public static void main(String[] args) {
		int h = 1;
		
		while (h <= 100) {
			if (h % 12 == 0) {
				System.out.println(h);
			}
			h++;
		}
		
	}
}

class mySolution_1 {   // 6.4
	public static void main(String[] args) {
		int myArray[] = {1,2,3,4,5};
		for(int number : myArray) {
			System.out.println("number is :"+" " + number);
		}
	}
}

//Lab 7.
class yourNumber {
public static void main(String[] args) { // 7.1
	int y = 0;
	do{
		System.out.println("order is :"+" " + y);
		y++;
		} while (y <= 20);
	}
}


class myEvenNumber {
public static void main(String[] args) { // 7.2
	int yourNumber = 90;
	do{
		if(yourNumber % 2 == 0 ){
			System.out.println( yourNumber + " "+ "is even number");
			yourNumber++;
		}
		
		} 
	while (yourNumber % 2 != 0); 
	}
}

// Lab 8.
class myBreak {
public static void main(String[] args) {
	for (int count = 0; count <= 20; count++) {
		if (count == 12)
		break;
		System.out.println(count);
		}
	}
}