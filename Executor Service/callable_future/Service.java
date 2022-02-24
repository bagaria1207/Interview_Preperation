package callable_future;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;


class Task implements Callable<Integer>{		
	@Override
	public Integer call() throws InterruptedException {
		Thread.sleep(300);
		return new Random().nextInt();
	}
}

public class Service {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService service = Executors.newFixedThreadPool(10);
		
		List<Future> allFutures = new ArrayList<>();
		for(int i=0;i<100;i++) {
			Future<Integer> future = service.submit(new Task());
			allFutures.add(future);
		}
		
		for(int i=0;i<100;i++) {
			Future<Integer> future = allFutures.get(i);			
			try {
				Integer result = future.get(1, TimeUnit.SECONDS);
				System.out.println("Result of future #" + i + "=" + result);
			} catch (TimeoutException e) {
				e.printStackTrace();
			}
		}
		
	}

}
