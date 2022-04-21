package pack3;


public class DivisionArrayUsingException {

	public static void main(String[] args) {

    int a=10,b=2,c=0;
    int ar[]=new int[3];   // Using Array
        
    System.out.println("Before division");
		
        try {
        	c=a/b;
        	 System.out.println(" after a/b="+c); //try no error dont go to catch
             
        }                                         // try is error go to the catch
	
	catch(ArithmeticException ex) {

		 System.out.println("inside catch"); 
	     ex.printStackTrace();
		}
     finally {
        	
        	 System.out.println("finally will execute always");  // Finally will Execute Always
             
        }
        System.out.println("After catch"); 
        
        System.out.println("After division"); 
        
       
    		}
    	
	
	}

		

