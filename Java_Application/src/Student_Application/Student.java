package Student_Application;

import java.util.Scanner;

public class Student {
	private String studentId;
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String courses;
	private int courseBalance= 0;
	private static int costOfCourse = 600;
	private static int id=1001;
	
	//constructor : prompt user to enter student name and year
	public Student() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student First Name : ");
		this.firstName= sc.nextLine();
		
		System.out.println("Enter Student LastName : ");
		this.lastName= sc.nextLine();
		
		System.out.println("2020 for Freshmen\n 2021 for junior \n 2023 for senior \n 2024 for Sophmore \n Enter Student Class Level :  ");
		this.gradeYear=sc.nextInt();
		System.out.println(firstName +" "+ lastName + " "+ gradeYear);
		
		System.out.println(firstName  + "  " + lastName + "  " + gradeYear + "  " + studentId);
		
	}
	//Generate an id
	private void SetStudentId() {
		//grade level +ID
		id++;
		this .studentId= gradeYear +" "+ id;
	}
	
	//Enroll for course
	public void enroll() {
		System.out.println("Enter coure to Entroll (Q for Quit) : ");
		Scanner sc1= new Scanner(System.in);
		String course =sc1.nextLine();
		if(course != "Q") {
			courses = courses + "\n" +course;
			courseBalance= courseBalance+costOfCourse;
		}
		System.out.println("Enroll in : " + courses);
		System.out.println("CourseBalance : " + courseBalance);
	}
}
