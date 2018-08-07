package com.alkatv.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author ashutosh.tct@gmail.com
 */
@SpringBootApplication
@ComponentScan("com.alkatv")
@EntityScan("com.alkatv.entities")
@EnableJpaRepositories("com.alkatv.repositories")
public class App {

	private static Logger log = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {
		log.info("App is up and kicking !!");
		HSQLDBConfig hsqlConfig = new HSQLDBConfig();
		hsqlConfig.init();
		SpringApplication.run(App.class, args);
	}


}
