package pack3;

public class ArrayTypeError {

	public static void main(String[] args) {
		
		
		int a=10,b=2,c=0;
	    int ar[]=new int[3];   // Using Array  length 3
	    System.out.println("Before division");   // dont use try and catch
	    ar[4]=56;    // array length  4 is not initalized
		c=a/b; 
		System.out.println("After division");
		
	}

}
