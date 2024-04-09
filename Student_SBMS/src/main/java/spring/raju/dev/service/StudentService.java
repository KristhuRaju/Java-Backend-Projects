package spring.raju.dev.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.raju.dev.model.Student;
import spring.raju.dev.repository.StudentRepository;

@Service

public class StudentService {

	@Autowired
	private StudentRepository studentRepository;
	 public void saveStudent(Student student) {
		 studentRepository.save(student);
	    }

	    public List<Student> findAllStudents() {
	        return studentRepository.findAll();
	    }

	    public List<Student> findAllStudentsBySchool(Integer schoolId) {
	        return studentRepository.findAllBySchoolId(schoolId);
	    }
}
