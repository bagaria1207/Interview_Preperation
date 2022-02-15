package important_questions;

public class LCM {
	
	public static int gcd(int x, int y) {
		if(x == 0) {
			return y;
		}
		return gcd(y%x, x);
	}
	
	public static int lcm(int x, int y) {
		return ((x/gcd(x,y))*y);
	}
	
	
	public static int gcdIterative(int a, int b) {
		int temp = 0;
		while(b != 0) {
			temp = b;
			b = a%b;
			a = temp;
		}
		return a;
	}
	public static void main(String[] args) {
		
		System.out.println("Greatest Common Divisor " + gcd(2, 6));
		System.out.println("Least Common Multiple   " + lcm(2,6));
		System.out.println("Greatest Common Divisor " + gcdIterative(2, 6));
	}

}
