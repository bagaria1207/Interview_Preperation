package threads;

public class Interrupt_Example extends Thread {
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.print(i + " ");
		}
		
		/*try {
			sleep(1000);
			System.out.println("Task A");
		}catch(InterruptedException ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println("Thread is running... ");*/
	}
	public static void main(String[] args) {
		
		Interrupt_Example ie = new Interrupt_Example();
		ie.start();
//		ie.interrupt();
		try {
			ie.interrupt();
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
	}

}
