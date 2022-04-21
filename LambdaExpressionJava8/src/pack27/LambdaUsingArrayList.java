package pack27;

import java.util.ArrayList;

@FunctionalInterface
interface Drawable1{   //Functional interface a interface which has single abstract method
	void draw1(); //Lambda expression can be applied to a functional interface
	
}

@FunctionalInterface
interface Sayable{
	void say(String s); //function with  arg with no return type
}                         //(with arg)

@FunctionalInterface
interface SayableReturn{
	String sayHello();  //function with no arg and with return type
}

@FunctionalInterface
interface Addition{
	int add(int a, int b); //function with arg and with return type
}

public class LambdaUsingArrayList {

	public static void main(String[] args) {
		

		Drawable1 dob=()->{
			System.out.println("draw method body");
		};
		dob.draw1();			
	Sayable sob=(s)->{    //(String s)
		System.out.println("Hello "+s);
	};
	sob.say("Kirthi");
	
	SayableReturn sr=()->{
	    return "Hi";
	};	
	System.out.println(sr.sayHello());
	
	Addition aob=(i,j)->(i+j);
	System.out.println(aob.add(2,7)); //l.add(9) will be display
	
	//Collection API arraylist
	
	ArrayList<Integer>l=new ArrayList<Integer>();
	l.add(8);
	l.add(76);
	l.add(45);
	l.add(65);
	
	l.forEach((n)->System.out.println(n));//Iterating list elements using Lambda
  }
}
















