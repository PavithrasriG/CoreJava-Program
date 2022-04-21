package pack28;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionInterfaceEx {

	public static void main(String[] args) {
		// find the length of the string using function interface
		Function<String,Integer> len=(str)->str.length();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.nextLine();
		int l=len.apply(s); // string apply
		System.out.println("Length of the string ="+l);
		
		
	}

}
