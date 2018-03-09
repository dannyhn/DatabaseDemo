package com.github.dannyhn.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.dannyhn.domain.UserAddress;
import com.github.dannyhn.repository.UserAddressRepository;

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
