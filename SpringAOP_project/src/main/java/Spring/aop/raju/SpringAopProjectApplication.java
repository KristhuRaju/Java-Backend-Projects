package Spring.aop.raju;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import Spring.aop.raju.model.Employee;
import Spring.aop.raju.service.EmployeeService;

@SpringBootApplication
public class SpringAopProjectApplication {

	public static void main(String[] args) {
	ApplicationContext applicationContext=	SpringApplication.run(SpringAopProjectApplication.class, args);
	EmployeeService employeeService = applicationContext.getBean(EmployeeService.class);
	employeeService.addEmplyoee(new Employee(100L,"Kristhu Raju","Birudula","raju@Java.Developer.gmail.com"));
	employeeService.getByEmployeeId(100L);
	employeeService.getAllEmployees();
	}

}
