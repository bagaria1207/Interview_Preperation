package basic;

public class FinalizeExample {

	public static void main(String[] args) {
		FinalizeExample q = new FinalizeExample();
		q = null;
		
		//q.finalize();

		// Requesting JVM to call Garbage Collector method
		System.gc();
		System.out.println("Main Completes");
	}

	// Here overriding finalize method
	@Override
	public void finalize()
	{
		System.out.println("finalize method overriden");
		System.out.println(10 / 0);
	}

}
