package com.aitrich.yellowpages.domain;

public class Company
{
	int companyId;
	String companyName,companyCity,companyEmail,companyWeb,companyPhone;
	public Company()
	{
		
	}
	public Company(int companyId,String companyPhone,String companyName,
			City companyCity,String companyEmail,String companyWeb)
	{
		this.companyId=companyId;
		this.companyPhone=companyPhone;
		this.companyName=companyName;
		this.companyCity=companyCity.toString();
		this.companyEmail=companyEmail;
		this.companyWeb=companyWeb;
		
	}
	
	
	public int getcompanyId()
	{
		return(companyId);
	}
	public String getcompanyPhone()
	{
		return(companyPhone);
	}
	public String getcompanyName()
	{
		return(companyName);
	}
	public String getcompanyCity()
	{
		return(companyCity);
	}
	public String getcompanyEmail()
	{
		return(companyEmail);
	}
	public String getcompanyWeb()
	{
		return(companyWeb);
	}		
}
