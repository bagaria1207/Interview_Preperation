package hashCode_Equals;

public class Person{
	
	public int personId;
	public int getPersonId() {
		return personId;
	}

	public String name;
	
	public Person(int personId, String name) {
		this.personId = personId;
		this.name = name;
	}
	
	//Eclipse generated HashCode
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + personId;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == this) {
			return true;
		}
		if(obj == null || obj.getClass() != this.getClass()) {
			return false;
		}
		Person thisPerson = (Person)obj;
		if(this.name == null) {
			if(thisPerson.name != null) {
				return false;
			}
		} else if(!this.name.equals(thisPerson.name)) {
			return false;
		}
		if(this.personId != thisPerson.personId) {
			return false;
		}
		return true;
	}
	
}
