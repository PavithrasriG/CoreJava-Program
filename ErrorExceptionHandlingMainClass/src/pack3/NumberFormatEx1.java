package pack3;



// number format using exception handling
public class NumberFormatEx1 {

	public static void main(String[] args) {
		
		// unchecked 2 checked Exception
		String s="abc";
		System.out.println("Before paresInt");
		try {
			int i=Integer.parseInt(s);
		}
		catch(NumberFormatException e) {
			e.printStackTrace();
		}
         catch(Exception ex){   // superclass
        	ex.printStackTrace() ;
         }
		System.out.println("After paresInt");
	}

}
