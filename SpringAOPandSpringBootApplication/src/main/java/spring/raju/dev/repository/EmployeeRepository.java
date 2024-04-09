package spring.raju.dev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import spring.raju.dev.entity.Employees;
@Repository
public interface EmployeeRepository extends JpaRepository<Employees, Long>{

}
