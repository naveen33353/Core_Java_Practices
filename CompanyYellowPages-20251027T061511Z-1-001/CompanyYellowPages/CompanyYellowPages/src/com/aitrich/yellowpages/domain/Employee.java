package com.aitrich.yellowpages.domain;

public class Employee
{
	int employeeId,employeePhone;
	String employeeName,employeeDesignation,employeeCity,employeeGender;
	Company c;
	public Employee(int employeeId,int employeePhone,String employeeName,
			String employeeDesignation,City employeeCity,String employeeGender, Company c)
	{
		this.employeeId=employeeId;
		this.employeePhone=employeePhone;
		this.employeeName=employeeName;
		this.employeeDesignation=employeeDesignation;
		this.employeeCity=employeeCity.toString();
		this.employeeGender=employeeGender;
		this.c=c;
	}

	
	public int getemployeeId()
	{
		return(employeeId);
	}
	public int getemployeePhone()
	{
		return(employeePhone);
	}
	public String getemployeeDesignation()
	{
		return(employeeDesignation);
	}
	public String getemployeeName()
	{
		return(employeeName);
	}
	public String getemployeeGender()
	{
		return(employeeGender);
	}
	public String getemployeeCity()
	{
		return(employeeCity);
	}
	public String getcompany()
	{
		return(c.companyName);
	}	
}
