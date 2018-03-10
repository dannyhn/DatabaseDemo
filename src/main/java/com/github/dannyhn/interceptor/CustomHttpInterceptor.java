package com.github.dannyhn.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.github.dannyhn.domain.HttpRequestHistory;
import com.github.dannyhn.repository.HttpRequestHistoryRepository;

public class CustomHttpInterceptor extends HandlerInterceptorAdapter {
	
	private final HttpRequestHistoryRepository httpRequestHistoryRepo;
	
	public CustomHttpInterceptor(HttpRequestHistoryRepository httpRequestHistoryRepo) {
		this.httpRequestHistoryRepo = httpRequestHistoryRepo;
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		httpRequestHistoryRepo.save(new HttpRequestHistory(request));
		return true;
	}
}
