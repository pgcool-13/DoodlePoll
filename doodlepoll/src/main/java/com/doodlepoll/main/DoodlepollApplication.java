package com.doodlepoll.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.doodlepoll.*"})
@ComponentScan("com.doodlepoll.*")
@EntityScan("com.doodlepoll.model")
@EnableJpaRepositories("com.doodlepoll.repository")
public class DoodlepollApplication {

	public static void main(String[] args) {
		SpringApplication.run(DoodlepollApplication.class, args);
	}

}
