package hashCode_Equals;

public class Test {
	
	public static void main(String[] args) {
		
		Person person1 = new Person(10001, "Suman Sharma");
		Person person2 = new Person(10002, "Mukesh Sharma");
		boolean result = person1.equals(person2);
		System.out.println(result);
		
	}
	
}
 