package factory;

import java.util.Scanner;

public class FactoryTesting {

	public static void main(String[] args) {
		
		GetFactoryInstance factoryInstance = new GetFactoryInstance();
		
		System.out.println("Enter the name of the plan for which the bill will be generated: ");
		
		Scanner sc = new Scanner(System.in);
		String type = sc.nextLine();
		
		FactoryClass fc = factoryInstance.getPlan(type);
		
		System.out.println("Enter the number of the units :");
		int units = sc.nextInt();
		
		System.out.println("Bill amount for " + type + " of " + units + " units is :");
		
		fc.getRate();
		fc.calculateBill(units);
		
		sc.close();
	}

}
