package CompanyYellowPages.src.com.aitrich.yellowpages;

import com.aitrich.yellowpages.domain.*;

public class YellowPages 
{

	public Company[] saveCompany()
	{
		
		    Company c[]=new Company[4];
			c[0]=new Company(-1,"8876354871","aitrich",City.THRISSUR,"Aitrich@gmail.com","Ait.in");
			c[1]=new Company(2, "9366654871","Asoften",City.MALAPPURAM,"Aich@gmail.com","it.com");		
			c[2]=new Company(3, "9958445654","tech",City.THRISSUR,"rich@gmail.com","At.in");			
			c[3]=new Company(4, "87423453545","Ait",City.MALAPPURAM,"rich12@gmail.com","Ait.in");
		    return c;
	}	
	
	public void ShowCompany()
	{
		
		Company c[]=saveCompany();
			
			for(int i=0;i<4;i++)
			{
			System.out.println(c[i]);
			}
	}
	
	public void companyStartA()
	{
		
		Company c[]=saveCompany();
		
		System.out.println("Company names starting with a:");
		for(int i=0; i<c.length; i++) {
		if(c[i].getcompanyName().toLowerCase().startsWith("a")) {
			System.out.println(c[i]);
		}
		}
	}
	
	
		
	public Employee[] saveEmployee()
	{
			Employee e[]=new Employee[4];
			Company c[]=saveCompany();
			e[0]=new Employee(1,23434354,"Emp A","Manager",City.THRISSUR,"Male",c[0]);
			e[1]=new Employee(2,23433454,"Emp B","CMO",City.MALAPPURAM,"Female",c[1]);
			e[2]=new Employee(3,23433254,"Emp C","Clerk",City.THRISSUR,"Female",c[2]);
			e[3]=new Employee(4,234322154,"Emp D","Sales",City.MALAPPURAM,"Male",c[3]);	
			return e;
	}
	
	public void ShowEmployee()
	{
		
		System.out.println("Employees with Company Details:");
		Employee e[]=saveEmployee();
		for(int i=0;i<4;i++)
		{
		System.out.println(e[i]);
		}	
	}
	
	public void empofgivencompany()
	{
		System.out.println("Employee details of a given company");
		Employee e[]=saveEmployee();
		
	}	
}
	





