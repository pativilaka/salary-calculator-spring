package com.vilaka.dependencyinjectionaula;

import com.vilaka.entities.Employee;
import com.vilaka.services.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.vilaka"})
public class DependencyInjectionAulaApplication implements CommandLineRunner {

	@Autowired
	private SalaryService salaryService;

	public static void main(String[] args) {
		SpringApplication.run(DependencyInjectionAulaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee("Maria", 4000);
		System.out.println(salaryService.netSalary(employee));
	}
}
