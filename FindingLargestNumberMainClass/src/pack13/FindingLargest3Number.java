package pack13;

import java.util.Scanner;

public class FindingLargest3Number {

	public static void main(String[] args) {
		
		int num1,num2,num3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		num1=sc.nextInt();
		System.out.println("Enter second number");
		num2=sc.nextInt();
		System.out.println("Enter Third number");
		num3=sc.nextInt();
		if(num1>num2 && num1>num3) {
			System.out.println(num1+" is larger than "+num2+" and "+num3);
		}
		else if(num2>num1 && num2>num3){
			System.out.println(num2+" is larger than "+num1+" and "+num3);
		}
		else if(num3>num1 && num3>num2){
			System.out.println(num3+" is larger than "+num1+" and "+num2);
		}
		else {
			System.out.println("All 3 numbers are equal");
	}

}}
