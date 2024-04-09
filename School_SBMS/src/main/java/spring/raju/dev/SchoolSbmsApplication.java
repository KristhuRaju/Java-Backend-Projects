package spring.raju.dev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class SchoolSbmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchoolSbmsApplication.class, args);
	}

}
