package multiple_Inheritance;

public class Frog implements Animal,TerrestrialAnimal,AquaticAnimal{

	@Override
	public void specialCapabilities() {
		
		System.out.println("Frog is an Amphibian Animal");
		System.out.println("Frog lives in both Land and Water");
		
	}

	@Override
	public void livesIn() {
		
		System.out.println("Lived in Water");
		
	}

}
