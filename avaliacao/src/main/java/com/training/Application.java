package com.training;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.training.dao.UserDAO;
import com.training.entity.Appraisee;
import com.training.entity.Appraiser;
import com.training.entity.User;

@SpringBootApplication
public class Application {
	
	private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    
    
    @Bean
	public CommandLineRunner demo(UserDAO repository) {
		return (args) -> {
			// save a couple of customers
			User appraisee = new Appraisee("Jack", "jack@jack");
			repository.save(appraisee);
			
			User appraiser = new Appraiser("Joe", "joek@joe");
			repository.save(appraiser);
			

			// fetch all customers
			log.info("Customers found with findAll():");
			log.info("-------------------------------");
			for (User user : repository.findAll()) {
				log.info(user.toString());
			}
			log.info("");

			// fetch an individual customer by ID
			User user = repository.findOne(1L);
			log.info("Customer found with findOne(1L):");
			log.info("--------------------------------");
			log.info(user.toString());
			log.info("");

			
			log.info("");
		};
	}

}
