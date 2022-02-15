package basic;

public class Sample {
	
	static {
		System.out.println("Static");
	}
	{
		System.out.println("Instance");
	}
	public Sample() {
		System.out.println("Contructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample s = new Sample();
	}

}
