package Spring.aop.raju.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import Spring.aop.raju.model.Employee;
@Service
public class EmployeeService {

	private List<Employee> employees= new ArrayList<>();
	
	public List<Employee> getAllEmployees(){
		System.out.println("GetAllEmploees() called");
		return employees;
		
	}
	public Employee getByEmployeeId(Long employeeId) {
		System.out.println("GetByEmployeeId() method Called");
		for(Employee employee:employees) {
			if(employee.getId()==Long.valueOf(employeeId)) {
				return employee;				
			}
		}
		return null;
		
	}
	public void addEmplyoee(Employee employee) {
		System.out.println("addEmployee() Called ");
		employees.add(employee);
	}
	
	public void updateEmployee(Employee employeeDetails) {
		System.out.println("UpdateEmployee() method  called ");
		for(Employee employee:employees) {
			if(employee.getId()==Long.valueOf(employeeDetails.getId())) {
				employees.remove(employee);
				employees.add(employeeDetails);
			}
		}
	}
}
