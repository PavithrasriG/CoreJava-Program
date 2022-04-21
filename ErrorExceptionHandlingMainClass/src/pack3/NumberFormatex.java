package pack3;

public class NumberFormatex {

	public static void main(String[] args) {
		
		String s="pavi";
		try {
			int i=Integer.parseInt(s);
			}
		catch(NumberFormatException e){
			e.printStackTrace();
		}
     System.out.println(s);
	}

}
