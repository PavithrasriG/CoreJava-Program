package pack;

//Thread concept by implementing Runnable Interface

class RunClass implements Runnable{

	@Override                 //override
	public void run() {
		
		System.out.println("Inside run method "+Thread.currentThread());  //JVM
	}
}

public class RunnableInterface {

	public static void main(String[] args) {
		
		RunClass ob = new RunClass();       //Create the class object
		Thread tob = new Thread(ob);     // Create the Thread object
		tob.setName("t1");   // Change the Thread Name
		tob.start();         // Thread using the Start is Runnable
	}

}
