package spring.raju.dev.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
@Entity
@Table(name="student_tbl")
@Builder
public class Student {
	 @Id
	 @GeneratedValue
		private Integer id;
	    private String firstname;
	    private String lastname;
	    private String email;
	    private Integer schoolId;
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getFirstname() {
			return firstname;
		}
		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}
		public String getLastname() {
			return lastname;
		}
		public void setLastname(String lastname) {
			this.lastname = lastname;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public Integer getSchoolId() {
			return schoolId;
		}
		public void setSchoolId(Integer schoolId) {
			this.schoolId = schoolId;
		}
		public Student(Integer id, String firstname, String lastname, String email, Integer schoolId) {
			super();
			this.id = id;
			this.firstname = firstname;
			this.lastname = lastname;
			this.email = email;
			this.schoolId = schoolId;
		}
		public Student() {
			
		}
}
