package multiple_Inheritance;

public class Dog implements Animal, TerrestrialAnimal{
	
	public String color = "Parent Color";
	private String name;
	private String breed;
	private int age;
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	public String getBreed() {
		return breed;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void eating() {
		System.out.println("Dog eats");
	}
	
	@Override
	public void specialCapabilities() {
		
		System.out.println("Dog barks");
		
	}

	@Override
	public void livesIn() {
		System.out.println("Lives on Land");
	}

}
