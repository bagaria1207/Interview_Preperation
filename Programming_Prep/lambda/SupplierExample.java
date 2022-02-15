package lambda;

import java.util.function.Supplier;

public class SupplierExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<Double> supp = () -> Math.random();
		System.out.println("Supplier Example : " + supp.get());
	}

}
