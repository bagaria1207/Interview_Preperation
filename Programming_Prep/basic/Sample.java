package basic;

/*public class Sample {
	
	static {
		System.out.println("Static");
	}
	{
		System.out.println("Instance");
	}
	public Sample() {
		System.out.println("Contructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample s = new Sample();
	}

}*/


/*
class X
{
    int m = 1111;
 
    {
        m = m++;
 
        System.out.println(m);
    }
}
 
class Y extends X
{
    {
        System.out.println(methodOfY());
    }
 
    int methodOfY()
    {
        return m-- + --m;
    }
}
 
public class Sample
{
    public static void main(String[] args)
    {
        Y y = new Y();
    }
}*/



/*
class A_Sample
{
    static String s = "AAA";
 
    static
    {
        s = s + "BBB";
        System.out.println(s);
    }
 
    {
        s = "AAABBB";
    }
}
 
class B_Sample extends A_Sample
{
    static
    {
        s = s + "BBBAAA";
        System.out.println(s);
    }
 
    {
        System.out.println(s);
    }
}
 
public class Sample
{
    public static void main(String[] args)
    {
    	B_Sample b = new B_Sample();
    }
}*/


/*
class A_Sample
{
    void A_Sample()
    {
        System.out.println(1);
    }
}
 
class B_Sample extends A_Sample
{
    void B_Sample()
    {
    	A_Sample();
    }
}
 
public class Sample
{
    public static void main(String[] args)
    {
        new B_Sample().B_Sample();
    }
}*/
/*
class ClassOne
{
    static int i = 111;
 
    int j = 222;
 
    {
        i = i++ - ++j;
    }
}
 
class ClassTwo extends ClassOne
{
    {
        j = i-- + --j;
        System.out.println("i " + i + " j " + j);
    }
}

public class Sample{
	public static void main(String[] args) {
		ClassTwo c2 = new ClassTwo();
	}
}*/

/*
class A_Sample
{
     
}
 
class B_Sample extends A_Sample
{
     
}
 
class C_Sample extends B_Sample
{
     
}
 
public class Sample 
{
    static void overloadedMethod(A_Sample a)
    {
        System.out.println("ONE");
    }
     
    static void overloadedMethod(B_Sample b)
    {
        System.out.println("TWO");
    }
     
    static void overloadedMethod(Object obj)
    {
        System.out.println("THREE");
    }
     
    public static void main(String[] args)
    {
        C_Sample c = new C_Sample();
         
        overloadedMethod(c);
    }
}
*/
class A_Sample
{
    static void methodOne()
    {
        System.out.println("AAA");
    }
}
 
class B_Sample extends A_Sample
{
    static void methodOne()
    {
        System.out.println("BBB");
    }
}
 
public class Sample
{
    public static void main(String[] args)
    {
        A_Sample a = new B_Sample();
         
        a.methodOne();
    }   
}





















