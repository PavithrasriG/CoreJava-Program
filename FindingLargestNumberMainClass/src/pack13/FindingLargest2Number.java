package pack13;

import java.util.Scanner;

public class FindingLargest2Number {

	public static void main(String[] args) {
		
		int num1,num2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		num1=sc.nextInt();
		System.out.println("Enter second number");
		num2=sc.nextInt();
		if(num1>num2) {
			System.out.println(num1+" is larger than "+num2);
		}
		else if(num2>num1){
			System.out.println(num2+" is larger than "+num1);
		}
		else {
			System.out.println("Both numbers are equal");
	}

}}