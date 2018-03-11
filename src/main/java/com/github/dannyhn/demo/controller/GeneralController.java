package com.github.dannyhn.demo.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.dannyhn.demo.domain.UserAddress;
import com.github.dannyhn.demo.repository.UserAddressRepository;

@RestController
public class GeneralController {
	
	private final UserAddressRepository userAddressRepo;
	
	public GeneralController(UserAddressRepository userAddressRepo) {
		this.userAddressRepo = userAddressRepo;
	}
	
	@GetMapping("/test")
	public ResponseEntity<List<UserAddress>> getAllUserAddress() {
		return ResponseEntity.ok(userAddressRepo.findAll());
	}

}
