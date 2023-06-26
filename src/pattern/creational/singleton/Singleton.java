package pattern.creational.singleton;

import java.util.Objects;

public class Singleton {

	private static Singleton instance;
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		if(Objects.isNull(instance)) {
			System.out.println("Creating Instance.");
			instance = new Singleton();
		}
		else {
			System.out.println("Instance already created.");
		}
		return instance;
	}
}
