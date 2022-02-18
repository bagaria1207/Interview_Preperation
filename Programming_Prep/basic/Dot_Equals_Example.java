package basic;

class People{
	public String name;
	
	public People(String name) {
		this.name = name;
	}	
	
	public boolean equals(People p) {
		return this.name == p.name;
	}
	
}

public class Dot_Equals_Example {

	public static void main(String[] args) {
		
		People p1 = new People("Apurva");
		People p2 = new People("Apurva");
		
		System.out.println(p1==p2);
		System.out.println(p1.equals(p2));

	}

}
