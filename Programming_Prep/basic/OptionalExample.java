package basic;

import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {
		
		String[] word = new String[10];
		Optional<String> checkNull = Optional.ofNullable(word[5]);
		if(checkNull.isPresent()) {
			System.out.println(word[5].toLowerCase());
		} else {
			System.out.println("Word[5] is null");
		}
		
	}

}
