package typesOfPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class TaskToComplete implements Runnable{
	
	@Override
	public void run() {
		//Some Tasks
	}
}

public class Types {

	public static void main(String[] args) {
		
		//Type 1:- Fixed Pool
		ExecutorService serviceFixedPool = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		
		//Type 2:- Cachched Pool(If all the threads are busy then create a new Thread for the task and place it in the pool.
		//         If thread is idle for 60 Seconds kill the thread and remove from Thread Pool.
		ExecutorService serviceCachedPool = Executors.newCachedThreadPool();
		
		//Type 3:- Scheduled Pool
		ScheduledExecutorService serviceScheduledPool = Executors.newScheduledThreadPool(10);
			
			//Type 1: Task to run after 10 second delay
			serviceScheduledPool.schedule(new TaskToComplete(), 10, TimeUnit.SECONDS);
			
			//Type 2: Task to run repetedly every 10 Seconds with initial delay of 10 seconds
			serviceScheduledPool.scheduleAtFixedRate(new TaskToComplete(), 15, 10, TimeUnit.SECONDS);
			
			//Type 3: Task to run repetedly every 10 Seconds after previous task completes
			serviceScheduledPool.scheduleWithFixedDelay(new TaskToComplete(), 15, 10, TimeUnit.SECONDS);
			
		//Type 4:- SingleThreadedExecutor(It creates only one thread in pool and if that thread dies, 
	    //         then the service itself creates a new Thread and places in the pool.
		ExecutorService serviceSingleThreadedExecutor = Executors.newSingleThreadExecutor();	

	}

}
