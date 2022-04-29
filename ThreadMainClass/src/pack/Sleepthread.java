package pack;

		class Task  extends Thread{
					//override the run method
		
	public void run() {
			for(int i=1;i<=55;i++) {
			System.out.println("Inside run Method "+Thread.currentThread());
			 try {
		  Thread.sleep(10000);     // 5 time output display and  after few min all output display
		  }
			 catch(InterruptedException e) {
		 e.printStackTrace();
			}
			}
			}
		}

public class Sleepthread {

	public static void main(String[] args) {
						Task ob=new Task (); //new state
						Task  ob1=new Task (); 	//new state
						System.out.println("Main JVM Thread "+Thread.currentThread());
						System.out.println("Thread-0 "+ob.isAlive());     //state of thread
						System.out.println("Thread-1 "+ob1.isAlive());
						ob.setName("first");       // name change the thread
						ob1.setName("second");
						ob.start(); //Runnable state
						ob1.start(); //Runnable state
						
					}}

