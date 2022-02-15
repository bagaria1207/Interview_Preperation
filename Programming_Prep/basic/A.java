package basic;

public interface A{
	String s = "Yo";
	public void method1();
}

interface B{}

interface C extends A, B {
//	public void method1();
	public void method1(int x);
}
