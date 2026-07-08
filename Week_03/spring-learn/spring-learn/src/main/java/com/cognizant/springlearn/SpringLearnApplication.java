package com.cognizant.springlearn;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.springlearn.model.Country;
import com.cognizant.springlearn.service.CountryService;

@SpringBootApplication
public class SpringLearnApplication {

	private static final Logger logger = LoggerFactory.getLogger(SpringLearnApplication.class);
	
	public static void main(String[] args) {
		//SpringApplication.run(SpringLearnApplication.class, args);
		//displayCountry();
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		CountryService service = context.getBean("countryService", CountryService.class);
		Scanner sc = new Scanner(System.in);
		String countryCode = sc.nextLine();
		Country country = service.getCountry(countryCode);
		if(country != null)
			logger.info("Country : {}", country);
		else
			System.out.println("country doesn't exist");
		sc.close();
	}
	
	/*public static void displayCountry()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		Country country = context.getBean("country", Country.class);
		logger.info("Country : {}", country.toString());
	}*/
}
