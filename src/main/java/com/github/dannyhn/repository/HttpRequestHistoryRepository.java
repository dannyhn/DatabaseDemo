package com.github.dannyhn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.dannyhn.domain.HttpRequestHistory;

public interface HttpRequestHistoryRepository extends JpaRepository<HttpRequestHistory, Long>  {

}
