// https://medium.com/@kevalpatel2106/digesting-singleton-design-pattern-in-java-5d434f4f322#:~:text=The%20purpose%20of%20the%20singleton,new%20instance%20of%20the%20class.&text=Singletons%20are%20often%20useful%20where,as%20database%20connections%20or%20sockets.

package Singleton;

public class SingletonClass {
	private static SingletonClass singleInstance;

	/*----------------------------------------------------------------------------------------------------*/

//	private SingletonClass() {}
	
	/*----------------------------------------------------------------------------------------------------*/

	/**
	 * To prevent singleton failure while due to reflection we have to
	 * thrown a run time exception in constructor, if the constructor is
	 * already initialized and some class to initialize it again.
	 */
	
	private SingletonClass() {
		if(singleInstance != null) {
			throw new RuntimeException("Use getInstance method to get the single instance of this class");
		}
	}
	
	public static SingletonClass getInstance() {
		if(singleInstance == null) {
			
			//prevent from multithreading conditions
			synchronized (SingletonClass.class) {
				if(singleInstance == null) {
					singleInstance = new SingletonClass();
				}
			}
		}
		return singleInstance;
	}
	
	// Singleton safe from Serialize and Deserialize operation.
	protected SingletonClass readResolve() {
		return getInstance();
	}
	
}
