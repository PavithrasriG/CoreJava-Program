package pack;


// To know state of Thread

class Life extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(i+" "+Thread.currentThread());
		}
	}
}
public class ThreadLifeCycle {

	public static void main(String[] args) throws InterruptedException {
		
		Life ob=new Life();
		Life ob1=new Life();
		
		System.out.println("State of thread ob"+ob.isAlive()); // false
		System.out.println("State of thread ob1"+ob1.isAlive());//false
		
		ob.start();
		
		System.out.println("State of thread ob"+ob.isAlive());//true
		ob.join();//join
		
		System.out.println("State of thread ob"+ob.isAlive());//false
		
		ob.start();
		System.out.println("State of thread ob"+ob.isAlive());//true
	}

}
