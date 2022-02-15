package amazon;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class MinimumTransportation {

	public static long getAdditionalCost(List<Integer> parcels, int k) {
		int req = k - parcels.size();
		long addtionalCost = 0;
		long flag = 1;
		int i = 0;
		Collections.sort(parcels);
		while(req > 0) {
			System.out.println("Req " + req + " additionalCost " + addtionalCost + " flag " + flag);
			if(i < parcels.size() && flag != parcels.get(i)) {
				addtionalCost += flag;
				flag++;
				req--;
			} else if(i >= parcels.size()) {
				addtionalCost += flag;
				flag++;
				req--;
			}
			else {
				flag++;
				i++;
			}
		}
		return addtionalCost;
	}
	
	public static void main(String[] args) {
		
		//System.out.println("Result " + getAdditionalCost(new ArrayList<Integer>(Arrays.asList(2,3,6,10,11)), 9));
		System.out.println("Result " + getAdditionalCost(new ArrayList<Integer>(Arrays.asList(6,5,4,1,3)), 7));
	}

}
