package pack;


//Print table using thread 
//2 thread 	using the print table

	class TableNum{
	  void print(int num) {  //for uninterrupted o/p use synchronized and join method
			for(int i=1;i<=10;i++) {
			System.out.println(num+"x"+i+"="+num*i);  //5x1=5
			}
		}
	}

	class FirstThread extends Thread{
		TableNum t1;
	    FirstThread(TableNum t1){
			this.t1=t1;
		}
		public void run() {
			t1.print(5);// table 5
		}
	}

	class SecondThread extends Thread{
		TableNum t1;
		
	 public SecondThread(TableNum t1) {
			this.t1=t1;
		}

		public void run() {
			t1.print(20);  //table 20
		}
	}

	public class AnnonymousPrintTable {

		public static void main(String[] args) {
			TableNum t1=new TableNum();
			FirstThread ob=new FirstThread(t1);
			
	        SecondThread ob1=new SecondThread(t1);
	        ob.start(); //calls run method of first thread
	        try {
				ob.join();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
	        ob1.start();
		}

	}


	


