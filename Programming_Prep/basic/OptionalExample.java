package basic;

import java.util.Optional;
import java.util.Arrays;
import java.util.List;

public class OptionalExample {

	public static void main(String[] args) {
		
		String[] word = new String[10];
		Optional<String> checkNull = Optional.ofNullable(word[5]);
		if(checkNull.isPresent()) {
			System.out.println(word[5].toLowerCase());
		} else {
			System.out.println("Word[5] is null");
		}
		
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		
		nums.stream().forEach(i -> {
			if(i%2 == 0) {
				System.out.print(i+ " ");
			}
		});
		
		
	}

}
