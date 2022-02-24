package ioIntensiveTask;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 
 * @author bagar
 * Whenever there is a IO Intensive Task we take the higher pool size.
 */

class IOTask implements Runnable{
	
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.print(" Text " + i + " Thread Name " + Thread.currentThread().getName());
		}
		System.out.println();
	}
	
}

public class ExecutorServiceExample {

	public static void main(String[] args) {
		
		ExecutorService service = Executors.newFixedThreadPool(100);
		for(int i=0;i<1000;i++) {
			service.execute(new IOTask());
		}

	}

}
