package pack;


		//To create thread based application
		//1. Extend your class with Thread class and override public void run()
		//to call run method jvm uses ob.start()
		//start can be used only once on particular object
		
class MainThread extends Thread{
			public void run() {
				System.out.println("Inside run "+Thread.currentThread());
			}
		}

		public class MainThreadClass {

			public static void main(String[] args) {
				System.out.println(Thread.currentThread()); //main thread
			    MainThread ob=new MainThread();
				MainThread ob1=new MainThread();
				ob.setName("first"); //change the predefined name
				ob1.setName("second");
				ob.start();//Excecution of Thread is controlled by JVM
				            //You cannot predict the output
				ob1.start();
				//thread can be started only once on particular object
				//if you start more than once, It will throw IlligalThreadState Exception
	}

}
