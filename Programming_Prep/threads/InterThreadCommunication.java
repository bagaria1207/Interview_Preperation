package threads;

class Account{
	int amount;
	public Account(int amt){
		this.amount = amt;
	}
	
	int getBalance() {
		return this.amount;
	}
	synchronized void withdraw(int amt) {
		try {
			System.out.println("Withdraw started");
			if(amount < amt) {
				System.out.println("Insufficient balance " + 
				" Withdraw Amount is -> " + amt + 
				" Account balance is -> " + getBalance() + 
				" "+ Thread.currentThread().getName());
				wait();
			}
		}catch(InterruptedException ex) {
			System.out.println(ex.getMessage());
		}		
		this.amount -= amt;
		System.out.println("Withdraw completed and balance in account is : " + getBalance());
	}
	
	synchronized void deposit(int amt) {
		System.out.println("Deposit started");
		amount = amount + amt;
		System.out.println("Deposit Completed Deposit Amount is -> " + amt + 
				" Account balance is -> " + getBalance() + 
				" "+ Thread.currentThread().getName());
		notify();
	}
	
}

public class InterThreadCommunication {

	public static void main(String[] args) {
		
		Account a = new Account(10000);
		
		new Thread() {
			public void run() {
				setName("Thread 1");
				a.withdraw(15000);
			}
		}.start();
		
		new Thread() {
			public void run() {
				setName("Thread 2");
				a.deposit(10000);
			}
		}.start();
		
	}

}
