package pack;


class HelloThread extends Thread{
	public HelloThread(String string) {
		super(string);// super class constructor
	}
	
	public void run() {
		for(int i=1;i<=5;i++) {
		System.out.println("i="+i+" thread name"+Thread.currentThread());
		 try {
	  Thread.sleep(10000);     // 5 time output display and  after few min all output display
	  }
		 catch(InterruptedException e) {
	 e.printStackTrace();
		}
		}
	
	}
}


public class SleepUsingConstructorThread {

	public static void main(String[] args) {
		
        HelloThread tob1=new HelloThread("First");
        HelloThread tob2=new HelloThread("Second");
        System.out.println("Main JVM Thread "+Thread.currentThread());
		System.out.println("Thread-0 "+tob1.isAlive());     //state of thread
		System.out.println("Thread-1 "+tob2.isAlive());
		tob1.start(); //Runnable state
		tob2.start(); //Runnable state
	}

}
