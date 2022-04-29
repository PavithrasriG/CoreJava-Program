package pack;

// To create thread based application
//1. Extend your class with thread class and override public void  run()
// to call run method jvm uses ob.start()
// start can be used only once on particular object

	class Hello  extends Thread{
		       //override the run method
	public void run() {
	     System.out.println("Inside run Method "+Thread.currentThread());   //current thread
		}
	}


public class HelloMainThread {

public static void main(String[] args) {

	    System.out.println("Main JVM Thread "+Thread.currentThread());   //JVM
		Hello ob=new Hello(); //new state
		Hello ob1=new Hello(); 	//new state
	    
	    ob.start(); //Runnable state  
	    ob1.start();// start will call run method
	            // each object use start method only once 
	            // otherwise it will throws IllegalThreadStateException
	           // we cannot predict which child thread execute first
              // Exceution of thread is controlled by JVM
	          // you cannot predict the output
	}

}
