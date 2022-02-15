package basic;

import exceptionhandling.UDException;
public class CustomExceptionhandled {

	public static void main(String[] args) {
		
		try {
			throw new UDException("Successfull !!");
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
		} finally {
			System.out.println("Believe !!");
		}
		
	}

}
