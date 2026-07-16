package com.cognizant.loan.model;

public class Loan {
	private String number;
	private String type;
	private double loan;
	private double emi;
	private int tenure;
	
	public Loan()
	{
		
	}
	
	public Loan(String number, String type, double loan, double emi, int tenure)
	{
		this.number = number;
		this.type = type;
		this.loan = loan;
		this.emi = emi;
		this.tenure = tenure;
	}
	
	public void setNumber(String number)
	{
		this.number = number;
	}
	
	public String getNumber()
	{
		return number;
	}
	
	public void setType(String type)
	{
		this.type = type;
	}
	
	public String getType()
	{
		return type;
	}
	
	public void setLoan(double loan)
	{
		this.loan = loan;
	}
	
	public double getLoan()
	{
		return loan;
	}
	
	public void setEmi(double emi)
	{
		this.emi = emi;
	}
	
	public double getEmi()
	{
		return emi;
	}
	
	public void setTenure(int tenure)
	{
		this.tenure = tenure;
	}
	
	public int getTenure()
	{
		return tenure;
	}
}