package pack;



class Customer{
	int amount;
	public Customer() {
		amount=10000;
	}
	
	synchronized void deposit(int amount) {
		System.out.println("Inside deposit");
		this.amount =this.amount+amount;
		System.out.println("Amount is deposited ");
		 notify();
	}
	
    synchronized void withdraw(int amount)throws InterruptedException  {
    	System.out.println("Inside withdraw");
		if(amount>this.amount) {
			System.out.println("withdraw is not possible");
			System.out.println("First you have to deposit");
			wait();
			this.amount=this.amount-amount;
			System.out.println("Your balance after withdraw ="+this.amount);
		}
		else {
			this.amount=this.amount-amount;
			System.out.println("Your balance after withdraw ="+this.amount);
		}
		
	}
	
	
}



public class Bank {

	public static void main(String[] args) {
		
		
		 Customer cob = new Customer();
		 Thread tob = new Thread() {
			 public void run() {
				
					cob.deposit(4000);
				
					
				}
		 };	 
		 tob.start();
		 Thread tob1 = new Thread() {
			 public void run() {
				 try {
					cob.withdraw(600);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				};
				 
			 }
		 };
		 tob1.start();

	}

}
