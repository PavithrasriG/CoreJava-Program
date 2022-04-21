package pack3;

import java.util.Scanner;

public class OneTryandMultipleCatchUsingSubclassSuperclass {

	public static void main(String[] args) {
		 
		int a=70,b=6,c=0;
		int ar[]= new int[3];
		Scanner sc=new Scanner(System.in);
		System.out.println("Before Exception");
		
		try {
			System.out.println("inside try");
			c=a/b;  // arithmeticException
			ar[6]=4;
			
	}// specific first subclass exception than the superclass
	catch(ArithmeticException e) {  //subclass
		System.out.println("Arithmetic Exception");
		e.printStackTrace();
	}

		catch(Exception ex) {    //super class is exception
			ex.printStackTrace();
		}

		finally {
			System.out.println("finally is always execute");
		}
	}

}
