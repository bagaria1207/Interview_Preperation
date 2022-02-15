package sender.receiver_synchronization_problem;

public class Data {

	private String packet;
	private boolean transfer = true;
	
	//Works when transfer is false
	public synchronized String receive() {
		while(transfer) {
			try {
				wait();
			}catch(InterruptedException ex) {
				Thread.currentThread().interrupt();
				System.out.println("Thread Interrupt ");
			}
		}
		
		transfer = true;
		String returnPacket = packet;
		notifyAll();
		return returnPacket;
	}
	
	//Works when transfer is true
	public synchronized void send(String packet) {
		while(!transfer) {
			try {
				wait();
			} catch(InterruptedException ex) {
				Thread.currentThread().interrupt();
				System.out.println("Thread Interrupted ");
			}
		}
		
		transfer = false;
		this.packet = packet;
		notifyAll();
	}
	
}
