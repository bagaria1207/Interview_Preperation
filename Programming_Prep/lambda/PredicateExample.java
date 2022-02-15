package lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> pred = aux -> (aux >= 18);
		Predicate<Integer> predSecond = aux -> (aux >=18 && aux < 20);
		
		BiPredicate<Integer, Integer> biPred = (x, y) -> {
			return x > y;
		};
		//System.out.println(pred.test(10));
		
		//List<Integer> ageList = Arrays.asList(18,19,20,21,2,3,5).stream().filter(pred).collect(Collectors.toList());
		
		//List<Integer> ageList = Arrays.asList(18,19,20,21,2,3,5).stream().filter(predSecond).collect(Collectors.toList());
		
		/*List<Integer> ageList = Arrays.asList(18,19,20,21,2,3,5)
				.stream()
				.filter(predSecond.negate())
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		*/
		
		boolean biPredRes = biPred.test(5,10) ;
		
		System.out.println(biPredRes);
		
	}

}
