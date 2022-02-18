package lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MethodReference {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("10", "1", "11");
		
		List<Integer> values = list.stream().map(aux -> Integer.parseInt(aux)).collect(Collectors.toList());
		System.out.println(values);

		List<Integer> value = list.stream()
				.map(Integer::parseInt)
				.filter(aux -> (aux < 11))
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		System.out.println(value);
		
	}

}
