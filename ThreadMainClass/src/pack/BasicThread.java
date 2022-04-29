package pack;

class BasicClass  extends Thread{
	       //override the run method
public void run() {
     System.out.println("Inside run Method "+Thread.currentThread());   //current thread
	}
}


public class BasicThread {

public static void main(String[] args) {

	BasicClass ob=new BasicClass(); //new state
	BasicClass ob1=new BasicClass(); 	//new state
    System.out.println("Main JVM Thread "+Thread.currentThread());   //JVM
    ob.start(); //Runnable state  
    ob1.start();// start will call run method
            // each object use start method only once 
            // otherwise it will throws IllegalThreadStateException
           // we cannot predict which child thread execute first
}
}
