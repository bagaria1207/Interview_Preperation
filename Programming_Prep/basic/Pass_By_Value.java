package basic;

public class Pass_By_Value {
	
	public static void change(int x) {
		x = 5;
	}
	
	public static void main(String[] args) {
		
		int x = 10;
		change(x);
		System.out.println(x);
		
	}

}
