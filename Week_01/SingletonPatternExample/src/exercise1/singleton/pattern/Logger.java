package exercise1.singleton.pattern;

public class Logger {
	private static Logger instance;
	
	private Logger() 
	{
		
	}
	
	public static synchronized Logger getInstance()
	{
		if(instance == null)
			instance = new Logger();
		return instance;
	}
}