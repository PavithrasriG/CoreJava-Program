package pack3;

import java.util.Scanner;

public class OneTrywithMultipleCatchusingEH {

	public static void main(String[] args) {
		int a=45,b=5,c;
		int ar[]=new int[4];
		Scanner sc=new Scanner(System.in);
		System.out.println("Before Exception");
		
		try {
			System.out.println("inside try");
			c=a/b;  // arithmeticException
			ar[6]=4;
			
	}
	catch(ArithmeticException e) {
		System.out.println("Arithmetic Exception");
		e.printStackTrace();
	}
catch(ArrayIndexOutOfBoundsException ex) {
	System.out.println("Array index out of bounds Exception");
	ex.printStackTrace();
}
		finally {
			System.out.println("finally is always execute");
		}
	}

}
