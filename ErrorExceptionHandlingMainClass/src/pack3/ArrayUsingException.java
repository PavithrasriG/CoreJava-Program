package pack3;

public class ArrayUsingException {

	public static void main(String[] args) {
		
		int a=10 ,b=0,c=0;
		int ar[]=new int[3];  // Array length
		System.out.println("Before division");
		try{
		  c=a/b;                    //try and catch using arthimeticException
		  System.out.println("After a/b  "+c);
			}
		catch(ArithmeticException ex) {
			
		System.out.println("Inside Catch");
	    ex.printStackTrace();
	    System.out.println(ex.getMessage());// String java.lang.throwable.getmessage()
	    System.out.println(ex);//returns the details message string of this throwable
		}
	finally {      //Finally will Execute always
		System.out.println("Finally will Execute always");
		System.out.println("Finally Block is used to close resource data base,network");
		
	}
		System.out.println("After catch");
			
	}

}
