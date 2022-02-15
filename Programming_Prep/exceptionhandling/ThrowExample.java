package exceptionhandling;

public class ThrowExample {

	public static void main(String[] args) {
		
		try {
			throw new ArithmeticException("Sample exmple");
		} catch(Exception ex){
			System.out.println("Exception ex : "+ ex.getMessage());
		} finally {
			System.out.println("Hello");
		}

	}

}
