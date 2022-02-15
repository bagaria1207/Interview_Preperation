package lambda;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.List;

@FunctionalInterface
interface Shape {
	String shape();
}

public class Intro {

	public static void main(String[] args) {
		Shape shape1 = new Shape() {
			
			@Override
			public String shape() {
				return "I am Square";
			}
		};
		
		System.out.println("Shape details : " + processShape(shape1));
		
		Shape shape2 = () -> {
			return "I am Circle";
		};
		
		Shape shape3 = () -> {
			return "I am Octagon";
		};
		
		System.out.println("Shape details : " + processShape(shape2));
		System.out.println("Shape details : " + processShape(shape3));
		System.out.println("Shape details : " + processShape(() -> { return "I am Rhombus"; }));
		System.out.println("Shape details : " + processShape(() -> "I am Awesome" ));
		
		int[] nums = new int[] {4,5,6,7,0,1,2};
		List<Integer> array = Arrays.stream(nums).boxed().collect(Collectors.toList());

	}
	
	public static String processShape(Shape shape) {
		return shape.shape();
	}

}
