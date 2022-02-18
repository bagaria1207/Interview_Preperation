package basic;

class Sample_Test{
	int x;
	Sample_Test(){
		x = 0;
	}
	Sample_Test(int i){
		x = i;
	}
}

public class Object_By_Reference {
	
	public static void doesNotChange(Sample_Test sample) {
		sample = new Sample_Test(5);
	}
	
	public static void change(Sample_Test sample) {
		sample.x = 100;
	}	
	
	public static void swap(Integer i, Integer j) 
	{
		Integer temp = i;
		i = j;
		j = temp;
	}
	
	public static void main(String[] args) {
		
		/*Sample_Test sample = new Sample_Test(10);
		doesNotChange(sample);
		change(sample);
		System.out.println(sample.x);*/
		
		Integer i = new Integer(10);
		Integer j = new Integer(20);
		swap(i,j);
		System.out.println("i = " + i + ", j = " + j);

	}

}
