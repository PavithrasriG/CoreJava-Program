package pack3;

public class DivisionErrorException {

public static void main(String[] args) {

	int a=10 ,b=0,c=0;
	System.out.println("Before division");
	try{
	  c=a/b;                    //try and catch using arthimeticException
		}
	catch(ArithmeticException ex) {
	         
	  ex.printStackTrace();
	}
System.out.println("After division");
	
	}

}
