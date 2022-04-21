package pack10;

import java.util.Scanner;

public class TriangleUserInputValues {

	public static void main(String[] args) {

		float b,h,a;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the base of the triangle");
		b=sc.nextFloat();
		System.out.println("Enter the height of the triangle");
		h=sc.nextFloat();
		
		a=(b*h)/2;
		
		System.out.println("The area of the triangle with base "+b+" and height "+h+" is "+a);
	}

}
