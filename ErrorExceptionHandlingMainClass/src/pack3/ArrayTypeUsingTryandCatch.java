package pack3;

public class ArrayTypeUsingTryandCatch {

	public static void main(String[] args) {
		
		int a=10 ,b=0,c=0;
		int ar[]=new int[3];
		System.out.println("Before division");
		try{
		  c=a/b;                    //try and catch using arthimeticException
			}
		catch(ArithmeticException ex) {
		         
		  ex.printStackTrace();
		}
	System.out.println("After division");
		
	 try{                 // Arrayindexout of bounds exception
	    ar[3]=89;         //After array assignment array  length 1 is display dont go to the catch     
		}          // Change the array length try is not work go to the catch
	catch(ArrayIndexOutOfBoundsException e) {
	         
	  e.printStackTrace();
	}
    System.out.println("After array assignment");	
		
		
		
	}

}
