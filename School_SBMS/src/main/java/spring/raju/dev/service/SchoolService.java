package spring.raju.dev.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.raju.dev.dto.SchoolResponse;
import spring.raju.dev.model.School;
import spring.raju.dev.repo.SchoolRepository;
import spring.raju.dev.student.StudentClient;

@Service

public class SchoolService {

	@Autowired
	private SchoolRepository repository;
	
	
	private StudentClient client ;

	public void saveSchool(School school) {
		repository.save(school);
	}

	public List<School> findAllSchools() {
		return repository.findAll();
	}
	
	public SchoolResponse findSchoolWithStudents(Integer schoolId) {
		 var school=repository.findById(schoolId)
				 .orElse(School.builder()
						 .name("NOT_FOUND")
						 .email("NOT_FOUND")
						 .build()
						 );
		 
		var students =client.findAllStudentsBySchool(schoolId);
		return SchoolResponse.builder().name(school.getName())
				.email(school.getEmail())
				.students(students)
				.build();
						

		
	}
}
