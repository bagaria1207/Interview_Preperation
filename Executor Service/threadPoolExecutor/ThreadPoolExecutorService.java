package threadPoolExecutor;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class CustomRejectionHandler implements RejectedExecutionHandler{

	@Override
	public void rejectedExecution(Runnable arg0, ThreadPoolExecutor arg1) {
		//Logging / Other operations based on Use Case		
	}
	
}

public class ThreadPoolExecutorService {

	public static void main(String[] args) {
	
		ExecutorService service = new 
				ThreadPoolExecutor(
				10, //corePoolSize
				100,//maximumPoolSize
				120,//keepAliveTime
				TimeUnit.SECONDS,
				new ArrayBlockingQueue<>(300),//Capacity
				new CustomRejectionHandler());

	}

}
