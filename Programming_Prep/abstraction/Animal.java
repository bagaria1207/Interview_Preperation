package abstraction;

abstract class Animal_Abstract {
	abstract void getType();
	abstract void getFood();
	int age;
}

abstract class Animal_Under extends Animal_Abstract{

	@Override
	void getType() {
		// TODO Auto-generated method stub
		System.out.println("Dog");
	}
	
}


abstract class Animal_Under_Under extends Animal_Under{
	
	@Override
	void getFood() {
		// TODO Auto-generated method stub
		System.out.println("MeatLoaf");
	}
	
}

class Animal_Super extends Animal_Under_Under{

}

public class Animal{
	
	public static void main(String[] args) {
		Animal_Under au = new Animal_Super();
		System.out.println("Animal Under");
		au.getType();
		au.getFood();
		System.out.println(au.getClass().getName());
		System.out.println();
		Animal_Under_Under auu = new Animal_Super();
		System.out.println("Animal Super");
		auu.getType();
		auu.getFood();
		System.out.println(auu.getClass().getName());
		
		
		
	}
	
}
