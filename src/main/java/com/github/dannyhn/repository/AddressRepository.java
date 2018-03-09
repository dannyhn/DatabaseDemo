package com.github.dannyhn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.dannyhn.domain.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}