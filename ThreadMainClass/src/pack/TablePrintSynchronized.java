package pack;


 class PrintTable{
   synchronized	void print(int num) {           // synchronized	
		for(int i=1;i<=10;i++) {
		System.out.println(num+"x"+i+"="+num*i);  //5x1=5
		}
	}
}

class FirstClass extends Thread{           //First class
	PrintTable ti;
	FirstClass(PrintTable ti){
		this.ti=ti;
	}
	public void run() {
		ti.print(8);
	}
}

class SecondClass extends Thread{            //Second class
	PrintTable ti;
	
	public SecondClass(PrintTable ti) {
		this.ti=ti;
	}

	public void run() {
		ti.print(9);
	}
}


		
public class TablePrintSynchronized {

	public static void main(String[] args) {
		PrintTable ti=new PrintTable();       //Create object using the table
		FirstClass sw=new FirstClass(ti);
	
        SecondClass sw1=new SecondClass(ti);
        sw.start(); //calls run method of firstthread
        sw1.start();
	}
}
