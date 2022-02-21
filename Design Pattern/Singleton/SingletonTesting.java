package Singleton;

import java.lang.reflect.Constructor;

public class SingletonTesting {

	public static void main(String[] args) {
		/*----------------------------------------------------------------------------------------------------*/
		/**
		 * Below we can see that the hashcode is same for both but we can
		 * break this pattern using Reflection API
		 */
		
//		SingletonClass instanceOne = SingletonClass.getInstance();
//		SingletonClass instanceTwo = SingletonClass.getInstance();
//		
//		
//		System.out.println(instanceOne.hashCode());
//		System.out.println(instanceTwo.hashCode());
		
		/*----------------------------------------------------------------------------------------------------*/
		
		/**
		 * Using Reflection API we can change the runtime behaviour
		 */
		
		SingletonClass instanceOne = SingletonClass.getInstance();
		SingletonClass instanceTwo = null;
		try {
			Class<SingletonClass> classInstance = SingletonClass.class;
			Constructor<SingletonClass> constructorInstance = classInstance.getDeclaredConstructor();
			constructorInstance.setAccessible(true);
			instanceTwo = constructorInstance.newInstance();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		System.out.println(instanceOne.hashCode());
		System.out.println(instanceTwo.hashCode());
		
	}

}
