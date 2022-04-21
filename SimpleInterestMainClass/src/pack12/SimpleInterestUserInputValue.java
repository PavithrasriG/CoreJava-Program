package pack12;

import java.util.Scanner;

public class SimpleInterestUserInputValue {
	public static void main(String[] args) {

	float p,t,r,si;
	
    Scanner sc= new Scanner(System.in);
	System.out.println("Enter principle amount");
	p=sc.nextFloat();
	System.out.println("Enter time");
	t=sc.nextFloat();
	System.out.println("Enter rate of interest");
	r=sc.nextFloat();
	si=(p*t*r)/100;
	
System.out.println("The simple interest of principle amount "+p+" and time "+t+" with rate of interest "+r+" is "+si);
}
}