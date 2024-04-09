package spring.raju.dev.dto;

import java.util.List;

import lombok.Builder;
import spring.raju.dev.model.Student;

@Builder

public class SchoolResponse {
	
	private String name;
    private String email;
    List<Student> students;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public SchoolResponse(String name, String email, List<Student> students) {
		super();
		this.name = name;
		this.email = email;
		this.students = students;
	}
	public SchoolResponse() {
	}
	@Override
	public String toString() {
		return "SchoolResponse [name=" + name + ", email=" + email + ", students=" + students + "]";
	}
}
