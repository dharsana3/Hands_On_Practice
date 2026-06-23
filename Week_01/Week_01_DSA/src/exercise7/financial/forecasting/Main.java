package exercise7.financial.forecasting;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the present value : ");
		int presentValue = sc.nextInt();
		System.out.println("Enter the growth rate : ");
		int growthRate = sc.nextInt();
		System.out.println("Enter the no of years : ");
		int years = sc.nextInt();
		double finalValue = ForecastService.finalValue(presentValue, growthRate, years);
		System.out.println("Final Value : " + finalValue);
		sc.close();
	}
}
