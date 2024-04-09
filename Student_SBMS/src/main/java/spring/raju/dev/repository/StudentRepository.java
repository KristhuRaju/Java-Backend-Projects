package spring.raju.dev.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.raju.dev.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{
	List<Student> findAllBySchoolId(Integer schoolId);
}
