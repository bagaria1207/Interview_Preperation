package cpuIntensiveTask;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 
 * @author bagar
 * Whenever there is a CPU Intensive Task we take the thread pool size as the number of cores present in the CPU.
 */

class CPUIntensiveTask implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.print(i + " " + " Thread Name -> " + Thread.currentThread().getName());
		}
		System.out.println();
	}
	
}

public class ExecutorServiceExample {

	public static void main(String[] args) {
		
		Integer coreCount = Runtime.getRuntime().availableProcessors();
		System.out.println(coreCount + " " + "CoreCount");
		ExecutorService service = Executors.newFixedThreadPool(coreCount);
		
		for(int i=0;i<100;i++) {
			service.execute(new CPUIntensiveTask());
		}
		
	}

}
