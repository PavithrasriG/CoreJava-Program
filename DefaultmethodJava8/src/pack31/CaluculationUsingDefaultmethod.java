package pack31;

// calculation 

	interface Calulations{
			void add(int a, int b);
			 default void mult(int a, int b) {  // default using mult
				int m=a*b;
				System.out.println("product="+m);
				
			}
			 static void sub(int a, int b) {  //static  using sub
				 int ans=a-b;
				 System.out.println("Difference="+ans);
				 
			 }
		}

	public class CaluculationUsingDefaultmethod  implements Calulations {
			@Override
			public void add(int a, int b) {
				int s=a+b;
				System.out.println("sum="+s);
				
			}

			public static void main(String[] args) {
				CaluculationUsingDefaultmethod  ob=new CaluculationUsingDefaultmethod ();
				ob.add(4, 6);
				ob.mult(8, 6);
				Calulations.sub(8,2);

			}
	}


