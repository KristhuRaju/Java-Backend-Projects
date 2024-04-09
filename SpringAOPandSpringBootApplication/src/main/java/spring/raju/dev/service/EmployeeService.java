package spring.raju.dev.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.raju.dev.entity.Employees;
import spring.raju.dev.exception.ResourceNotFoundException;
import spring.raju.dev.repository.EmployeeRepository;
@Service
public class EmployeeService {

	 @Autowired
	    private EmployeeRepository employeeRepository;

	    public List < Employees > getAllEmployees() {
	        return employeeRepository.findAll();
	    }

	    public Optional<Employees> getEmployeeById(Long employeeId)
	    throws ResourceNotFoundException {
	        return employeeRepository.findById(employeeId);
	    }

	    public Employees createEmployee(Employees employee) {
	        return employeeRepository.save(employee);
	    }

	    public Employees updateEmployee(Long employeeId,
	        Employees employeeDetails) throws ResourceNotFoundException {
	        Employees employees = employeeRepository.findById(employeeId)
	     .orElseThrow(() - > new ResourceNotFoundException("Employee not found for this id :: " + employeeId));

	    	
	    			employees.setEmailId(employeeDetails.getEmailId());
	    	employees.setLastName(employeeDetails.getLastName());
	    	employees.setFirstName(employeeDetails.getFirstName());
	        final Employees updatedEmployee = employeeRepository.save(employees);
	        return updatedEmployee;
	    }

	    public Map < String, Boolean > deleteEmployee(Long employeeId)
	    throws ResourceNotFoundException {
	        Employees employee = employeeRepository.findById(employeeId)
	            .orElseThrow(() - > new ResourceNotFoundException("Employee not found for this id :: " + employeeId));

	        employeeRepository.delete(employee);
	        Map < String, Boolean > response = new HashMap < > ();
	        response.put("deleted", Boolean.TRUE);
	        return response;
	    }

}
