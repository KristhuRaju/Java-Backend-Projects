package spring.raju.dev.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import spring.raju.dev.dto.SchoolResponse;
import spring.raju.dev.model.School;
import spring.raju.dev.service.SchoolService;

@Controller
@RequestMapping
public class SchoolController {

	@Autowired
	private  SchoolService schoolService;

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void save(@RequestBody School school) {
		schoolService.saveSchool(school);
	}

	@GetMapping
	public ResponseEntity<List<School>> findAllSchools() {
		return ResponseEntity.ok(schoolService.findAllSchools());
	}
	@GetMapping("/students/{schoolId}")
	public ResponseEntity<SchoolResponse> findAllStudentsBySchoolId(@PathVariable("id") Integer schoolId){
		return ResponseEntity.ok(schoolService.findSchoolWithStudents(schoolId));
		
	}
}
