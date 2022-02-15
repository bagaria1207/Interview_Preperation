package threads;

class E implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Thread E -> " + i);
		}
	}
}

class F implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Thread F -> " + i);
		}
	}
}

public class Thread_States {

	public static void main(String[] args) {
		try {
			Thread t1 = new Thread(new E());
			Thread t2 = new Thread(new F());
			Thread t3 = new Thread(new F());
			t1.start();
			t2.start();
			t1.wait();
			t3.start();
			t1.notify();
			//t1.sleep(100);
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
		}

	}

}
