package domain;

public class Application {
	private String applicationId;
	private String jobId;
	private String seekerId;
	private String applicationDate;
	
	public Application(String applicationId,String jobId,String seekerId,String applicationDate) {
		this.applicationId = applicationId;
		this.jobId = jobId;
		this.seekerId = seekerId;
		this.applicationDate = applicationDate;
	}
	
	public String getapplicationId() {
		return applicationId;
	}
	public void setapplicationID(String newValue) {
		applicationId = newValue;
	}
	public String getjobId() {
		return jobId;
	}
	public void setjobId(String newValue) {
		jobId = newValue;
	}
	public String getseekerId() {
		return seekerId;
	}
	public void setseekerId(String newValue) {
		seekerId = newValue;
	}
	public String getapplicationDate() {
		return applicationDate;
	}
	public void setapplicationDate(String newValue) {
		applicationDate = newValue;
	}
	
}
