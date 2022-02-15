package leetcode;

public class Gas_Station {

	public static int gasStation(int[] gas, int[] cost) {
		int surplus = 0;
		int deficit = 0;
		int start = 0;
		for(int i=0;i<gas.length;i++) {
			surplus = surplus + gas[i] - cost[i];
			if(surplus < 0) {
				start = i + 1;
				deficit += surplus;
				surplus = 0;
			}
		}
		return surplus + deficit >= 0 ? start : -1;
	}
	
	public static void main(String[] args) {
		
		int[] gas = new int[] {1, 2, 3, 4, 5};
		int[] cost = new int[] {3, 4, 5, 1, 2};
		
		System.out.println(gasStation(gas, cost));
	}

}
