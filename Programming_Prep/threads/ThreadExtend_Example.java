package threads;

class C extends Thread{
	public void run() {
		for(int i=0;i<11;i++) {
			System.out.println("Thread A " + i);
		}
	}
}

class D extends Thread{
	public void run() {
		for(int i=0;i<11;i++) {
			System.out.println("Thread B " + i);
		}
	}
}

public class ThreadExtend_Example {

	public static void main(String[] args) {
		
		C a = new C();
		D b = new D();
		a.start();
		b.start();

	}

}
