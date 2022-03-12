package hashCode_Equals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class IdComparator implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		return o1.personId - o2.personId;
	}
	
}

public class Test {
	
	public static void main(String[] args) {
		
		Person person1 = new Person(10001, "Suman Sharma");
		Person person2 = new Person(10002, "Mukesh Sharma");
		Person person3 = new Person(10003, "qukesh Sharma");
		Person person4 = new Person(10004, "eukesh Sharma");
		Person person5 = new Person(10005, "tukesh Sharma");

//		boolean result = person1.equals(person2);
//		System.out.println(result);
		
		List<Person> personList = new ArrayList<Person>();
		personList.add(person1);
		personList.add(person2);
		personList.add(person3);
		personList.add(person4);
		personList.add(person5);

//		personList.stream().forEach(p1 -> System.out.println(p1.personId+ " "));
//		System.out.println("After Comparator");
//		Collections.sort(personList, Collections.reverseOrder(new IdComparator()));
//		personList.stream().forEach(p1 -> System.out.println(p1.personId+ " "));
		
		//Print maximum using Stream
		
		Person maxPerson = personList.stream().max(Comparator.comparingInt(Person::getPersonId)).get();
		
		System.out.println(maxPerson.personId);
		
	}
	
}
 