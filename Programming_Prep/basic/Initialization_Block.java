package basic;

public class Initialization_Block {
	
	public int x;
	public static int y;
	{
		x = 4;
		System.out.println(x);
	}
	static {
		y = 20;
		System.out.println(y);
	}
	public Initialization_Block() {
		x = 10;
		try {
			System.out.println(x);
			throw new ArithmeticException("Exception Thrown");
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}finally {
			System.out.println("Ended");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Initialization_Block ib = new Initialization_Block();
		
	}

}
