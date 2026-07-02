package exercise4;

public class DeadlineService {
	public String getStatus(int daysRemaining) 
	{
		if(daysRemaining < 0)
			return "OVERDUE";
		else if(daysRemaining == 0)
			return "DUE_TODAY";
		else if(daysRemaining <= 3)
			return "URGENT";
		else
			return "ON_TRACK";
	}
}