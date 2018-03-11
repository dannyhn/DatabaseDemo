package com.github.dannyhn.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.dannyhn.demo.domain.UserAddress;

public interface UserAddressRepository extends JpaRepository<UserAddress, Long>{

}
