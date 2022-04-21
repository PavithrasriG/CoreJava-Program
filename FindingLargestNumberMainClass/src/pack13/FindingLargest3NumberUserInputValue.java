package pack13;

import java.util.Scanner;

public class FindingLargest3NumberUserInputValue {

	public static void main(String[] args) {
	    
		int  num1,num2,num3,lar;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first number");
		num1 = sc.nextInt();
		System.out.println("Enter 2nd number");
		num2 = sc.nextInt();
		System.out.println("Enter 3rd number");
		num3=sc.nextInt();
		
		lar = (num1>num2 && num1>num3)?num1:(num2>num1 && num2>num3)?num2:num3;
		System.out.println("The largest of "+num1+","+num2+" and "+num3+" is "+lar);


	}

}
