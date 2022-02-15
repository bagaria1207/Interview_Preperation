package exceptionhandling;

public class UDException extends Exception{
	
	String message;
	public UDException(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return "My Own Exception :" + message;
	}
	
}
