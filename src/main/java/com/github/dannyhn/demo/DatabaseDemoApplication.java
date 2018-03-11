package com.github.dannyhn.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.github.dannyhn.demo.domain.Address;
import com.github.dannyhn.demo.domain.User;
import com.github.dannyhn.demo.repository.AddressRepository;
import com.github.dannyhn.demo.repository.UserRepository;

@SpringBootApplication
public class DatabaseDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatabaseDemoApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(UserRepository userRepo, AddressRepository addressRepo) {
		return (args) -> {
			User user = new User();
			user.setName("Danny");
			user.setEmail("123@gmail.com");
			User savedUser = userRepo.save(user);
			
			Address address = new Address();
			address.setUserId(savedUser.getId());
			address.setCity("LA");
			address.setZipcode("90210");
			addressRepo.save(address);
		};
	}
}
