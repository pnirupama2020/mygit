package npatra.testjsf;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import npatra.testjsf.crud.CustomerRepository;
import npatra.testjsf.domain.Customer;

@ComponentScan({"npatra.testjsf.crud","npatra.testjsf.service","npatra.testjsf.controller"})

@SpringBootApplication
@Configuration
public class CustomerApplication  {
	
	@Autowired
	CustomerRepository repository;
	public static void main(String[] args) {
		
		SpringApplication.run(CustomerApplication.class, args);	
	}

	
}
