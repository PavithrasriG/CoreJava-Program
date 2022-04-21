package pack13;

import java.util.Scanner;

public class FindingLargestAndSmallest {

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		num=sc.nextInt();
		if(num>0) {
			System.out.println(num+" is greater than zero");
		}
		else {
			System.out.println(num+" is less than zero");
	}

}
}