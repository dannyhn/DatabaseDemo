package com.github.dannyhn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.dannyhn.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {

}