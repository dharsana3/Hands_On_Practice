package com.cognizant.springlearn.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Country {
	private String code;
	private String name;
	private static final Logger logger = LoggerFactory.getLogger(Country.class);
	
	public Country()
	{
		logger.info("Inside Country Constructor");
	}
	
	public void setCode(String code)
	{
		logger.info("Setter method of code.");
		this.code = code;
	}
	
	public String getCode()
	{
		logger.info("Getter method of code.");
		return code;
	}
	
	public void setName(String name)
	{
		logger.info("Setter method of name.");
		this.name = name;
	}
	
	public String getName()
	{
		logger.info("Getter method of  name.");
		return name;
	}
	
	@Override
	public String toString() 
	{
		logger.info("toString method");
        return "Country [code=" + code + ", name=" + name + "]";
    }
}