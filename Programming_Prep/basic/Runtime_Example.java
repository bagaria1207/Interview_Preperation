package basic;

import java.io.IOException;

public class Runtime_Example {

	public static void main(String[] args) throws IOException {
		Runtime r = Runtime.getRuntime();
		System.out.println(r.availableProcessors());
		System.out.println(r.freeMemory());
		System.out.println(r.totalMemory());
	}

}


