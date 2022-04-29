package pack;

public class AnnonymousUsingRunnable {

	public static void main(String[] args) {
		//Annonymous class
				Thread tob=new Thread() {
					public void run() {
						System.out.println("Run method");
					}
				};
				tob.start();
				
				//or
				new Thread() {
					public void run() {
						System.out.println("Run method is using thread");
					}
				}.start();
				
				//using Runnable interface
				Runnable rob=new Runnable() {
					public void run() {
						System.out.println("Runnable Run method");
					}
				};
				Thread tob1=new Thread(rob);
				tob1.start();
	}

}
