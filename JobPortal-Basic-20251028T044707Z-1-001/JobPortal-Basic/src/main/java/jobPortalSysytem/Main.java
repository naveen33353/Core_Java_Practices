package jobPortalSysytem;

public class Main {
	public static void main(String[] args) 
	{
		JobPortal jp = new JobPortal();
		jp.saveSeekerDetails();
		jp.showSeekerDetails();
		System.out.println();
		jp.showEmployerDetails();
		System.out.println();
		jp.showJobs();
		System.out.println();
		jp.searchJobs();
		System.out.println();
		jp.searchApplications();
	}

}
