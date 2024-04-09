package EmailApplication;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String email;
	private String department;
	private String alternateEmail;
	private Integer mailboxCapocity;
	private String companyname = "Coforge.com";

	// Constructor to recivie the firstName and LastName

	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;

		System.out.println("Email Created :" + this.firstName + " " + this.lastName);

		// call a method for department
		this.department = setDepartment();
		System.out.println("Code for Department : " + this.department);

		// call the password method random
		this.password = randomPassword(8);
		System.out.println("your password :" + this.password);

		// combine elements to generate the email
		email = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companyname;
		//System.out.println("Your Email is : " + email);

	}

	// ask for the Department
	private String setDepartment() {
		System.out.println(
				"New Worker :"+ firstName +"\nEnter Department Code : \n1 for Sales \n2 for DepartMent \n3 for Testingteam \n4 for none \n Enter DepartmentCode : ");
		Scanner sc = new Scanner(System.in);
		int departmentChioce = sc.nextInt();
		if (departmentChioce == 1) {
			return "Sales";
		} else if (departmentChioce == 2) {
			return "Development";
		} else if (departmentChioce == 3) {
			return "Testingteam";
		} else {
			return " ";
		}
	}

	// Genrate Random Password
	private String randomPassword(int length) {
		String passworsdset = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int random = (int) (Math.random() * passworsdset.length());
			password[i] = passworsdset.charAt(random);
		}
		return new String(password);

	}

	// set mailbox capacity
	public void setMailboxCapocity(Integer mailboxCapocity) {
		this.mailboxCapocity = mailboxCapocity;
	}

	public Integer getMailboxCapocity() {
		return mailboxCapocity;
	}

	// altermainative email
	public void setAlternateEmail(String alternateEmail) {
		this.alternateEmail = alternateEmail;
	}

	public String getAlternateEmail() {
		return alternateEmail;
	}

	// change password
	public void changePassword(String password) {
		this.password = password;
	}
	//Show All information
	public String showInfo() {
		return "Name : "+ firstName +" "+ lastName +" "+
				"\nEmail : " +email +
				"\nCapacity : "+mailboxCapocity+"mb";
	}

}
