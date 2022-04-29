package pack;
   

//Synchronized using the thread



	class Table{
			synchronized void printTable(int n) {
				for(int i=1;i<=10;i++) {
					System.out.println(n+"X"+i+"="+n*i);
				}
			}
		}

public class AnnonymousPrintTableUsingSynchronized {

	public static void main(String[] args) {
		
	Table t1=new Table();   // table create
	Thread tob=new Thread() {   // object will be create
	public void run() {
	System.out.println("Run method using the thread");
	t1.printTable(4);  // 4 table
						
		}
		};//thread tob
	tob.start();
			
	Thread tob1=new Thread() {   // 2object will be create
	public void run() {
	System.out.println("Run method");
	t1.printTable(10);  // 10 table
	}
};//tob1
tob1.start();
}

}


