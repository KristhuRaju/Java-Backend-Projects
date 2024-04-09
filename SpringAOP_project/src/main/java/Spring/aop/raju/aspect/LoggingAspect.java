package Spring.aop.raju.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
private final Logger LOGGER=LoggerFactory.getLogger(this.getClass());

@Before("execution (* Spring.aop.raju.service.EmployeeService.*())")
public void logBeforeAllMetthods(JoinPoint joinPoint) {
	LOGGER.debug("*** logingAspect.logBeforeAllMethod() "+joinPoint.getSignature().getName());
}

@Before("execution(* Spring.aop.raju.service.EmployeeService.getByEmployeeId())")
public void LogBeforeGetEmployee(JoinPoint joinPoint) {
	LOGGER.debug("*** loggeraspect.logbeforGetEmployee() "+ joinPoint.getSignature().getName());
}

@Before("execution(* Spring.aop.raju.service.EmployeeService.CreateEmployee())")
public void addBeforeEmployee(JoinPoint joinPoint) {
	LOGGER.debug("*** LoggerAspect.LogBeforeEmployeeCreateMethod() "+joinPoint.getSignature().getName());
}

@After("execution (* Spring.aop.raju.service.EmployeeService.*())")
public void logAfterAllmethods(JoinPoint joinPoint) {
	LOGGER.debug("*** logingAspect.logAfterAllMethod() "+joinPoint.getSignature().getName());
}

@After("execution(* Spring.aop.raju.service.EmployeeService.getByEmployeeId())")
public void LogAfterGetEmployee(JoinPoint joinPoint) {
	LOGGER.debug("*** loggeraspect.logAfterGetEmployee() "+ joinPoint.getSignature().getName());
}

@After("execution(* Spring.aop.raju.service.EmployeeService.CreateEmployee())")
public void addAfterEmployee(JoinPoint joinPoint) {
	LOGGER.debug("*** LoggerAspect.LogAfterEmployeeCreateMethod() "+joinPoint.getSignature().getName());

}
}
