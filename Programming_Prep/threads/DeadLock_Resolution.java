package threads;

//Locking the first resource on both the Thread simultaneously
public class DeadLock_Resolution {

	public static void main(String[] args) {
		
		DeadLock_Resolution obj = new DeadLock_Resolution();
		
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
				synchronized(resource1) {
					System.out.println("Thread 2 Locked resource 1");
					try {
						Thread.sleep(100);
					}catch(InterruptedException ex) {
						System.out.println(ex.getMessage());
					}
					synchronized(resource2) {
						System.out.println("Thread 2 Locked resource 2");
					}
				}
			}
		};
		
		
		new Thread(r1).start();
		new Thread(r2).start();

	}

}
