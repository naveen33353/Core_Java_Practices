package domain;

public class JobSeeker {
  private String seekerId;
  private String seekerName;
  private String seekerEmail;
  private String seekerPhone; 
  private String[] seekerSkills;  
  
  public JobSeeker(String id, String Name, String Email, String Phone, String[] skills) {
	  seekerId=id;
	  seekerName=Name;
	  seekerEmail=Email;
	  seekerPhone=Phone;
	  seekerSkills = new String[4];
//	  seekerSkills[0]="HTML";
//	  seekerSkills[1]="CSS";
//	  seekerSkills[2]="JS";
//	  seekerSkills[3]="BootStrap";
	  
	 
  }
  public String getseekerId() {
  return seekerId;
  }
  public void getseekerId(String newId) {
	  seekerId=newId;
  }
  public String getseekerName() {
	  return seekerName;
  }
  public void getseekerName(String newName) {
	  seekerName = newName;
  }
  public String getseekerEmail() {
	  return seekerEmail;
  }
  public void getseekerEmail(String newEmail) {
	  seekerEmail=newEmail;
  }
  public String getseekerPhone() {
	  return seekerPhone;
  }
  public void getseekerPhone(String Phone ) {
	  seekerPhone=Phone;
  }
  public String[] getseekerSkills() {
	  return seekerSkills;
  }
  public void getseekerSkills(String[] Skills) {
	  seekerSkills= Skills;
  }
  
  
  
}
