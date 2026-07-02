package mockito.exercise;

public class Service {
	
	private externalAPI api;
	public Service(externalAPI api)
	{
		this.api = api;
	}
	
	public String getStatus()
	{
		int temperature = api.getTemperature();
		if(temperature >= 40)
			return "Hot";
		else if(temperature >= 20)
			return "Moderate";
		else
			return "Cold";
	}
}