package com.github.dannyhn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.dannyhn.domain.UserAddress;

public interface UserAddressRepository extends JpaRepository<UserAddress, Long>{

}
