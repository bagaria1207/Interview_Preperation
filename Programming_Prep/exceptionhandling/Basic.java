package exceptionhandling;

public class Basic {

	public static void main(String[] args) {
		try {
			System.out.println(3/0);
		} catch(Exception ex) {
			System.out.println("Exception :" + ex.getMessage());
		} finally {
			System.out.println("Finished");
		}
	}

}
