package pack;

//program to print multiplication table using thread class

	
		class TableSyn{
			synchronized void printTable(int n) { //if n=2
				for(int i=1;i<=10;i++) {
					System.out.println(n+"X"+i+"="+n*i);  //2X1=2
				}
			}
		}

		class ThirdThread extends Thread{
			TableSyn t;
			ThirdThread(TableSyn t){
				this.t=t;
			}
			public void run() { 
				t.printTable(7);
			}
		}

		class FourthThread extends Thread{
			TableSyn t;
			FourthThread(TableSyn t){
				this.t=t;
				
			}
			public void run() {
				t.printTable(14);
			}
		}

		
public class AnnonymousSynchronizedUsing2Thread {
public static void main(String[] args) throws InterruptedException {
				TableSyn tob=new TableSyn();
				ThirdThread t1=new ThirdThread(tob);
				FourthThread t2=new FourthThread(tob);
				t1.start();
				t1.join();
				t2.start();

	}

}
