package spring.raju.dev.student;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import spring.raju.dev.model.Student;
@FeignClient(name = "student-service", url = "${StudentSbmsApplication.config.students-url}") 
public interface StudentClient {
	@GetMapping("/school/{school-id}")
    List<Student> findAllStudentsBySchool(@PathVariable("school-id") Integer schoolId);
}
