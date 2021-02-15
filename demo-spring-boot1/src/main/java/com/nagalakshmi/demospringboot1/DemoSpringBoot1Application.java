package com.nagalakshmi.demospringboot1;


import com.nagalakshmi.demospringboot1.model.Customer;
import com.nagalakshmi.demospringboot1.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoSpringBoot1Application {

	@Autowired
	private CustomerRepository custRepo;

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringBoot1Application.class, args);

	}

	@Bean
	public CommandLineRunner insertRecords() {
		return (args) -> {
			custRepo.save(new Customer("nags","posam"));
			custRepo.save(new Customer("saru","pillala"));
			custRepo.save(new Customer("naru","posam"));

		};
	}
}
