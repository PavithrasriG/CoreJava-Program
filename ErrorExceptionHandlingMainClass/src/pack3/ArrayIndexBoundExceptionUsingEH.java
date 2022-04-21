package pack3;

import java.util.Scanner;

public class ArrayIndexBoundExceptionUsingEH {

	public static void main(String[] args) {
		int a[]=new int[4];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array Element");
		for( int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
		}
		System.out.println("Array elements are");
        for(int i=0;i<a.length+1;i++) {
        	try {
        		System.out.println(a[i]);
        	}
       catch(ArrayIndexOutOfBoundsException e) {
    	   e.printStackTrace();
       }
        }
        System.out.println("statements after the loop");
	}
}