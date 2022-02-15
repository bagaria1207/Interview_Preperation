package sender.receiver_synchronization_problem;

public class Main extends Thread{

	public static void main(String[] args) {
		
		Data data = new Data();
		Thread sender = new Thread(new Sender(data));
		Thread receiver = new Thread(new Receiver(data));
		
		sender.start();
		receiver.start();

	}

}
