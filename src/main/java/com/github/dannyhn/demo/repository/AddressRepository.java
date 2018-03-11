package com.github.dannyhn.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.dannyhn.demo.domain.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
