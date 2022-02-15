package sender.receiver_synchronization_problem;

import java.util.concurrent.ThreadLocalRandom;

public class Sender implements Runnable{

	private Data data;
	
	public Sender(Data data) {
		this.data = data;
	}
	
	public void run() {
		String packets[] = {
				"First Packet",
				"Second Packet",
				"Third Packet",
				"Fourth Packet",
				"End"
		};
		
		for(String packet : packets) {
			data.send(packet);
			try {
				//trying to mimic server side lag
				Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 5000));
			}catch(InterruptedException ex){
				Thread.currentThread().interrupt();
				System.out.println("Thread Interrupted "+ ex);
			}
		}
	}
	
}
