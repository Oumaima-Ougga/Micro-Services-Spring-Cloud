package com.example.customerservice;

import com.example.customerservice.entities.Customer;
import com.example.customerservice.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class CustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CustomerRepository customerRepository, RepositoryRestConfiguration repositoryRestConfiguration){
       repositoryRestConfiguration.exposeIdsFor(Customer.class);
        return args->{
          customerRepository.save(new Customer(null,"name1","mail1"));
          customerRepository.save(new Customer(null,"name2","mail2"));
          customerRepository.save(new Customer(null,"name3","mail3"));
          customerRepository.findAll().forEach(c->{
                System.out.println(c.toString());
            });
        };
    }
}
