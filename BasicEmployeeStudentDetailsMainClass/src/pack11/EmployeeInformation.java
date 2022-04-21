package pack11;

import java.util.Scanner;

public class EmployeeInformation {

	public static void main(String[] args) {
		
		String name;  //store employeename
		int age;   //store age of an employee
		float sal;  //store employee sal
		char gen;  //emp gen
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter employee name");
		name=sc.nextLine(); //String
		System.out.println("Employee age");
		age=sc.nextInt(); //int
		System.out.println("Enter Employee salary");
		sal=sc.nextFloat(); //float
		System.out.println("Enter gender of Employee");
		gen=sc.next().charAt(0);
		
		System.out.println("Employee Details");
		System.out.println("Name ="+name);
		System.out.println("Age="+age);
		System.out.println("Salary="+sal);
		System.out.println("Gender="+gen);
	}

}
