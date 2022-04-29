package pack;

//Wait and Notify method

class MySync extends Thread{
	int total;
	public void run() {
		System.out.println("Inside run");// before wait 
		
		synchronized (this) {
			for(int i=1;i<=10;i++) {
				total=total+i;// after wait
			}
			notify();  //notify
		}
	}
	
}

public class ThreadLifeCycleUsingSynchronized {
public static void main(String[] args) throws InterruptedException {
	
	MySync ob=new MySync();
	  ob.start();
	  synchronized (ob) {
		  try {
			  System.out.println("Before Wait");
			  ob.wait();
			  System.out.println("After Wait");
			  System.out.println("Total="+ob.total);
			  
		  }catch(Exception e) {
			  e.printStackTrace();
		  }
	  }
		}

}
