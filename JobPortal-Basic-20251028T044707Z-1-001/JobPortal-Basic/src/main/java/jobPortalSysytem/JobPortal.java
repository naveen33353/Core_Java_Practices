package jobPortalSysytem;

import java.util.Scanner;

import domain.*;

public class JobPortal {
	
	public JobSeeker[] saveSeekerDetails() {
		//String seekerId,String seekerName,String seekerEmail,String seekerPhone,String[] seekerSkills
		JobSeeker[] js = new JobSeeker[5];
		js[0] = new JobSeeker("S1","Abijith ps","psabijith@gmail.com","+91987654321",new String[]{"HTML","CSS","JS","Java"});
		js[1] = new JobSeeker("S2","Aswin","aswin@gmail.com","+91987654321",new String[] {"HTML","CSS","JS","Java"});
		js[2] = new JobSeeker("S3","Naveen","naveen@gmail.com","+91987654321",new String[] {"HTML","CSS","JS","Java"});
		js[3] = new JobSeeker("S4","Benlin","benlin@gmail.com","+91987654321",new String[] {"HTMl","CSS","JS","Java"});
		js[4] = new JobSeeker("S5","Akshay","akshay@gmail.com","+91987654321",new String[] {"HTML","CSS","JS","Java"});
		return js;
	}

	public void showSeekerDetails() {
		JobSeeker[] showSeeker = saveSeekerDetails();
		for(int i = 0 ; i<showSeeker.length;i++) {
			System.out.print(showSeeker[i].getseekerId() + " ," + showSeeker[i].getseekerName()+","+showSeeker[i].getseekerEmail()+","+showSeeker[i].getseekerPhone()+","+showSeeker[i].getseekerSkills());
			System.out.println();
		}
	}
	
	public Employer[] saveEmployerDetails() {
//		String employerId,String employerName,String employerEmail,String employerPhone,String employerCompany
		Employer[] em = new Employer[4];
		em[0] = new Employer("E1","Arun","Arun@gmail.com","+91987654321","Aitrich");
		em[1] = new Employer("E2","Varun","Varun@gmail.com","+91987654321","Aitrich");
		em[2] = new Employer("E3","Tharun","Tharun@gmail.com","+91987654321","Aitrich");
		em[3] = new Employer("E4","Kiran","kiran@gmail.com","+91987654321","Aitrich");
		return em;
	}
	
	public void showEmployerDetails() {
		Employer[] showEmployer = saveEmployerDetails();
			for(int i = 0 ; i<showEmployer.length ; i++) {
				System.out.print(showEmployer[i].getemployerId()+","+showEmployer[i].getemployerName()+","+showEmployer[i].getemployerEmail()+","+showEmployer[i].getemployerPhone()+","+showEmployer[i].getemployerCompany());
				System.out.println();
			}
		
	}
	
	public Job[] saveJobs() {
//		String jobId,String jobTitle,String jobDesc,String jobLocation,JobType jobType,String salary
		Job[] jb = new Job[3];
		
		jb[0] = new Job("J1","Backend Dev","blah","Thrissur",JobType.FULLTIME,"50k");
		jb[1] = new Job("J2","UI/UX Designer","blah blah","Thrissur",JobType.PARTTIME,"50k");
		jb[2] = new Job("J3","Frontend Dev","blah blah blah","Thrissur",JobType.INTERSHIP,"50k");
		return jb;
	}
	
	public void showJobs() {
		Job[] showJobs = saveJobs();
		for(int i = 0 ; i<showJobs.length ; i++) {
			System.out.print(showJobs[i].getjobId()+","+showJobs[i].getjobTitle()+","+showJobs[i].getjobDesc()+","+showJobs[i].getjobLocation()+","+showJobs[i].getjobType()+","+showJobs[i].getsalary());
			System.out.println();
		}
	}
	
	public void searchJobs() {
		Job[] showJobs = saveJobs();
		Scanner sc = new Scanner(System.in);
		System.out.print("Search by ?(title/location):");
		String choice = sc.nextLine();
		switch (choice){
		case "title":
			System.out.print("Enter job title:");
			String title = sc.nextLine().trim().toLowerCase();
			for (int i = 0; i < showJobs.length; i++) {
                if (showJobs[i].getjobTitle().toLowerCase().contains(title)) {
                    System.out.println(showJobs[i].getjobId()+","+showJobs[i].getjobTitle()+","+showJobs[i].getjobDesc()+","+showJobs[i].getjobLocation()+","+showJobs[i].getjobType()+","+showJobs[i].getsalary());
                }
			}
			break;
		case "location":
			System.out.print("Enter job location:");
			String location = sc.nextLine().trim().toLowerCase();
			for (int i = 0; i < showJobs.length; i++) {
                if (showJobs[i].getjobLocation().toLowerCase().contains(location)) {
                    System.out.println(showJobs[i].getjobId()+","+showJobs[i].getjobTitle()+","+showJobs[i].getjobDesc()+","+showJobs[i].getjobLocation()+","+showJobs[i].getjobType()+","+showJobs[i].getsalary());
                }
			}
			break;
		}
		
	}
	
	public Application[] saveApplications() {
		Application[] ap = new Application[3];
//		String applicationId,String jobId,String seekerId,String applicationDate
		ap[0] = new Application ("A1","J1","S1","29/10/2025");
		ap[1] = new Application ("A2","J2","S2","29/10/2025");
		ap[2] = new Application ("A3","J3","S3","29/10/2025");
		return ap;
	}
	
	public void showApplication() {
		Application[] showApplication = saveApplications();
		for(int i = 0; i<showApplication.length;i++) {
			System.out.print(showApplication[i].getapplicationId()+","+showApplication[i].getjobId()+","+showApplication[i].getseekerId()+","+showApplication[i].getapplicationDate());
			System.out.println();
		}
	}
	
	public void searchApplications() {
		Application[] searchApplication = saveApplications();
		Scanner scanner = new Scanner(System.in);
		String choice = scanner.nextLine();
		System.out.print("Enter seeker ID:");
		for(int i = 0;i<searchApplication.length;i++) {
			if(searchApplication[i].getseekerId().toLowerCase().contains(choice)) {
				System.out.print(searchApplication[i].getapplicationId()+","+searchApplication[i].getjobId()+","+searchApplication[i].getseekerId()+","+searchApplication[i].getapplicationDate());
			}
		}
	}
}
