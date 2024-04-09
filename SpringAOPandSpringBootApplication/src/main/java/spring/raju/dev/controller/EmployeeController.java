package spring.raju.dev.controller;

import java.util.List;
import java.util.Map;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.raju.dev.entity.Employees;
import spring.raju.dev.exception.ResourceNotFoundException;
import spring.raju.dev.service.EmployeeService;
@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
	 @Autowired
	    private EmployeeService employeeService;

	    @GetMapping("/employees")
	    public List < Employees > getAllEmployees() {
	        return employeeService.getAllEmployees();
	    }

	    @GetMapping("/employees/{id}")
	    public ResponseEntity < Employees > getEmployeeById(@PathVariable(value = "id") Long employeeId)
	    throws ResourceNotFoundException {
	    	Employees employee = employeeService.getEmployeeById(employeeId)
	            .orElseThrow(() - > new ResourceNotFoundException("Employee not found for this id :: " + employeeId));
	        return ResponseEntity.ok().body(employee);
	    }

	    @PostMapping("/employees")
	    public Employees createEmployee(@Valid @RequestBody Employees employee) {
	        return employeeService.createEmployee(employee);
	    }

	    @PutMapping("/employees/{id}")
	    public ResponseEntity < Employees > updateEmployee(@PathVariable(value = "id") Long employeeId,
	        @Valid @RequestBody Employees employeeDetails) throws ResourceNotFoundException {
	    	Employees updatedEmployee = employeeService.updateEmployee(employeeId, employeeDetails);
	        return ResponseEntity.ok(updatedEmployee);
	    }

	    @DeleteMapping("/employees/{id}")
	    public Map < String, Boolean > deleteEmployee(@PathVariable(value = "id") Long employeeId)
	    throws ResourceNotFoundException {
	        return employeeService.deleteEmployee(employeeId);
	    }
}
