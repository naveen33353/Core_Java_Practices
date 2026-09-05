package domain;

public class Employer {
	private String employerId;
	private String employerName;
	private String employerEmail;
	private String employerPhone;
	private String employerCompany;
	
	public Employer(String employerId,String employerName,String employerEmail,String employerPhone,String employerCompany) {
		this.employerId = employerId;
		this.employerName = employerName;
		this.employerEmail = employerEmail;
		this.employerPhone = employerPhone;
		this.employerCompany = employerCompany; 
	}
	
	public String getemployerId() {
		return employerId;
	}
	public void setemployerId(String newValue) {
		employerId = newValue;
	}
	public String getemployerName() {
		return employerName;
	}
	public void setemployerName(String newValue) {
		employerName = newValue;
	}
	public String getemployerEmail() {
		return employerEmail;
	}
	public void setemployerEmail(String newValue) {
		employerEmail = newValue;
	}
	public String getemployerPhone() {
		return employerPhone;
	}
	public void setemployerPhone(String newValue) {
		employerPhone = newValue;
	}
	public String getemployerCompany() {
		return employerCompany;
	}
	public void setemployercompany(String newValue) {
		employerCompany = newValue;
	}
	
	public void showEmployer() {
		System.out.println(employerId);
		System.out.println(employerName);
		System.out.println(employerEmail);
		System.out.println(employerPhone);
		System.out.println(employerCompany);
	}
}

