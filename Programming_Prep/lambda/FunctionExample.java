package lambda;

import java.util.function.Function;

public class FunctionExample {

	public static void main(String[] args) {
		
		Function<Integer, Double> half = a -> a / 3.0;
		//andThen
		half = half.andThen(a -> a * 6.0);
		
		//compose
		//half = half.compose(a -> a * 5);
		
		//apply
		System.out.println(half.apply(5) );
	}

}
