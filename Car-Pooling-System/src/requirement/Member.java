package requirement;
import java.util.Date;

public class Member {
	
	private long id;
	private String firstName, lastName, email, contactNumber, licenseNumber;
	private Date licenseStartDate, licenseEndDate;
	public Member( long id, String firstName, String lastName, String email, String contactNumber,String licenseNumber, Date licenseStartDate, Date licenseEndDate) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.contactNumber = contactNumber;
		this.licenseNumber = licenseNumber;
		this.licenseStartDate = licenseStartDate;
		this.licenseEndDate = licenseEndDate;
		System.out.println("Member "+this.id);
		System.out.println("Name: "+this.firstName+" "+this.lastName);
		System.out.println("Member contact details: "+this.contactNumber+","+this.email);
		
		
	}
	public Member() {
		
	}
	public boolean sameEmail(String email1, String email2) {
		if(email1.equalsIgnoreCase(email2)) {
			return true;
		}else
			return false;
	}
	public boolean sameNumber(String contact1, String contact2) {
		if(contact1.equals(contact2)) {
			return true;
		}else
			return false;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public Date getLicenseStartDate() {
		return licenseStartDate;
	}
	public void setLicenseStartDate(Date licenseStartDate) {
		this.licenseStartDate = licenseStartDate;
	}
	public Date getLicenseEndDate() {
		return licenseEndDate;
	}
	public void setLicenseEndDate(Date licenseEndDate) {
		this.licenseEndDate = licenseEndDate;
	}
	public String getLicenseNumber() {
		return licenseNumber;
	}
	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}
		
	
}
