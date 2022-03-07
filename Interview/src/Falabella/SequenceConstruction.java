package falabella;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SequenceConstruction {
	
	public static List<Integer> constructSequence(int n, int lo, int hi){
		if(hi - n <0) {
			return new ArrayList<>(Arrays.asList(-1));
		} else {
			int secondHigh = hi - 1;
			List<Integer> result = new ArrayList<>();
			result.add(secondHigh);
			for(int i=hi;i>hi-lo;i--) {
				result.add(i);
			}
			return result;
		}
	}

}
