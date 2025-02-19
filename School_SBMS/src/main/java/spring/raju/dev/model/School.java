package spring.raju.dev.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
@Entity
@Table(name="scholl_tbl")
@Builder
public class School {
	  @Id
	    @GeneratedValue
	    private Integer id;
	    private String name;
	    private String email;
	    
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
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
		public School(Integer id, String name, String email) {
			super();
			this.id = id;
			this.name = name;
			this.email = email;
		}
		public School() {
			
		}
}
