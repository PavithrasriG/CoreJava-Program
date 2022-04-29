package pack;

//Join method are using try and catch Or throws Exception

class Try extends Thread{
		      
			//override run method
			public void run() {
				for (int i=1;i<4;i++) {
					System.out.println("Inside the run method"+Thread.currentThread());
				}
			}


		}
		
		
public class ThreadTryandCatch {

	public static void main(String[] args) {

        Try pa=new Try();
        Try pa1=new Try();
        System.out.println("main class");
        pa.setName("First");     // Change the Thread Name
        pa1.setName("Second");
        pa.start();
       try {             //    try and catch using the join method;
       
    	 pa.join()  ;// Join using the 1 thread  fully excute and after the 2 thread fully excute
    	 //  Checked exception
       }
       catch(InterruptedException e) {
       	e.printStackTrace();
       }
                 
        pa1.start();  // java.lang.Illegal ThreadException           
        System.out.println(pa.isAlive());	

	}

}
