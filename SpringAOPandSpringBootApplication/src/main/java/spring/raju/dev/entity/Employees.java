package spring.raju.dev.entity;

import jakarta.persistence.*;

@Entity
@Table(name="employess")
public class Employees {
	
	private long id;
    private String firstName;
    private String lastName;
    private String emailId;
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
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public Employees(String firstName, String lastName, String emailId) {
		super();
	
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
	}
    public Employees() {
    	
    }
	@Override
	public String toString() {
		return "Employees [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", emailId=" + emailId
				+ "]";
	}
    
}
