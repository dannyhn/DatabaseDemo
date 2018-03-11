package com.github.dannyhn.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.dannyhn.demo.domain.HttpRequestHistory;

public interface HttpRequestHistoryRepository extends JpaRepository<HttpRequestHistory, Long>  {

}
