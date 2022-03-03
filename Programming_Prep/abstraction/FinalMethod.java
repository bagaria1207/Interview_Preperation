package abstraction;

abstract class Base {

	final void fun()
	{
		System.out.println("Base fun() called");
	}
}

class Derived extends Base {

}

public class FinalMethod {

	public static void main(String args[])
	{

		Base b = new Derived();
		Derived d = new Derived();
		b.fun();
		d.fun();
	}
}
