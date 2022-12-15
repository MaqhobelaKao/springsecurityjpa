package com.maqhobela.springsecurtyjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.maqhobela.springsecurtyjpa.repositores.UserRepository;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class SpringsecurtyjpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringsecurtyjpaApplication.class, args);
	}

}
