package pack;

//  Join method are using try and catch Or throws Exception
class Mythread extends Thread{
      
	//override run method
	public void run() {
		for (int i=1;i<4;i++) {
			System.out.println(" Thread the run method"+Thread.currentThread());
		}
	}


}

public class MainClassThrows {

	public static void main(String[] args)throws InterruptedException   {  //join using the throwsException
		
		
		
		 Mythread pa=new Mythread();
         Mythread pa1=new Mythread();
         System.out.println("main class");
         System.out.println("Thread the run method"+Thread.currentThread());  //JVM
         pa.setName("First");     // Change the Thread Name
         pa1.setName("Second");
         pa.setPriority(8);   /// setPriority
         pa1.setPriority(1);
         pa.start();
         System.out.println(pa.isAlive()); // True or false using isAlive
         pa.join();              
         pa1.start();
         //  Checked exception
         System.out.println(pa.isAlive());
	}

}
