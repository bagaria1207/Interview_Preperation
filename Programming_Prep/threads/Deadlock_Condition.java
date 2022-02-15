package threads;

public class Deadlock_Condition {

	public static void main(String[] args) {
		
		Deadlock_Condition obj = new Deadlock_Condition();
		
		final String resource1 = "Apurva";
		final String resource2 = " Bagaria";
		
		Runnable r1 = new Runnable() {
			public void run() {
				synchronized(resource1) {
					System.out.println("Thread 1 Locked resource 1");
					try {
						Thread.sleep(100);
					}catch(InterruptedException ex) {
						System.out.println(ex.getMessage());
					}
					synchronized(resource2) {
						System.out.println("Thread 1 Locked resource 2");
					}
				}
			}
		};
		
		Runnable r2 = new Runnable() {
			public void run() {
				synchronized(resource2) {
					System.out.println("Thread 2 Locked resource 2");
					try {
						Thread.sleep(100);
					}catch(InterruptedException ex) {
						System.out.println(ex.getMessage());
					}
					synchronized(resource1) {
						System.out.println("Thread 2 Locked resource 1");
					}
				}
			}
		};
		
		
		new Thread(r1).start();
		new Thread(r2).start();

	}
}
