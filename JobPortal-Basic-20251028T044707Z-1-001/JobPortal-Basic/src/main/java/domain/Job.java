package domain;

public class Job {
	private String jobId;
	private String jobTitle;
	private String jobDesc;
	private String jobLocation; 
	private JobType jobType;
	private String salary;
	
	public Job(String jobId,String jobTitle,String jobDesc,String jobLocation,JobType jobType,String salary) {
		this.jobId = jobId;
		this.jobTitle = jobTitle;
		this.jobDesc = jobDesc;
		this.jobType = jobType;
		this.salary = salary;
	}
	
	public String getjobId() {
		return jobId;
	}
	public void setjobId(String newValue) {
		jobId = newValue;
	}
	public String getjobTitle() {
		return jobTitle;
	}
	public void setjobTitle(String newValue) {
		jobTitle = newValue;
	}
	public String getjobDesc() {
		return jobDesc;
	}
	public void setjobDesc(String newValue) {
		jobDesc = newValue;
	}
	public String getjobLocation() {
		return jobLocation;
	}
	public void setjobLocation(String newValue) {
		jobLocation = newValue;
	}
	public JobType getjobType() {
		return jobType;
	}
	public void setjobType(JobType newValue) {
		jobType = newValue;
	}
	public String getsalary() {
		return salary;
	}
	public void setsalary(String newValue) {
		salary = newValue;
	}
	
	public void showJob() {
		System.out.println(jobId);
		System.out.println(jobTitle);
		System.out.println(jobDesc);
		System.out.println(jobLocation);
		System.out.println(jobType);
		System.out.println(salary);
	}
}
