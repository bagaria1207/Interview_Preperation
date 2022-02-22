package factory;

abstract class FactoryClass {
	
	public double rate;
	abstract void getRate();
	
	public void calculateBill(int units) {
		System.out.println("Bill total : " + rate * units);
	}
	
}
