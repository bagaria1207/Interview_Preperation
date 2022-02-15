package lambda;

interface A {
	void sayHello();
}

public class Why_Lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A obj = new A() {
			
			@Override
			public void sayHello() {
				System.out.println("Hello ");
			}
			
		};
		
		A obj2 = () -> System.out.println("Hello");
		
		obj2.sayHello();
		
	}

}
