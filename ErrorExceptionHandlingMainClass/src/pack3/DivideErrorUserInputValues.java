package pack3;

import java.util.Scanner;

public class DivideErrorUserInputValues {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("main");
		System.out.println("First number"); // declare the number
		a=sc.nextInt();
		System.out.println("Second Number");
        b=sc.nextInt();
        System.out.println("before division");
        try {
        c=a/b;
        }
        catch(ArithmeticException e) {
        	e.printStackTrace();
        	System.out.println("catch block");
        }
        finally{
        	System.out.println("finally is always execute");
        }
        System.out.println("after storing values");
        
	}

}
