package exercise7.financial.forecasting;

public class ForecastService {
	public static double finalValue(int presentValue, int growthRate, int years)
	{
		if(years == 0)
			return presentValue;
		return (finalValue(presentValue, growthRate, years - 1) * (1 + growthRate / 100.0));
	}
}