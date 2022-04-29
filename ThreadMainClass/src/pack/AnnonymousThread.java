package pack;

public class AnnonymousThread {

	public static void main(String[] args) {
		
		
		// object creating
		Thread ob=new Thread() {
			public void run() {
				System.out.println("Run Method");
			}
		};
		ob.start();
		
		
		
		//Or
		// object is not creating
		new Thread() {
		
		
		public void run() {
			System.out.println("Run Method is using java");
		}
		} .start();
		
		
		
	}}
