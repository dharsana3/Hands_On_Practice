package exercise1.singleton.pattern;

public class Test {
	public static void testSingleton()
	{
		Logger instance1 = Logger.getInstance();
		Logger instance2 = Logger.getInstance();
		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());
		if(instance1 == instance2)
			System.out.println("Only one instance is created!!");
		else
			System.out.println("Singleton is not working!!");
	}
}