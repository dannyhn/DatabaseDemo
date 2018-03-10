package com.github.dannyhn.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.github.dannyhn.interceptor.CustomHttpInterceptor;
import com.github.dannyhn.repository.HttpRequestHistoryRepository;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
	
	@Autowired
	private HttpRequestHistoryRepository httpRequestHistoryRepo;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new CustomHttpInterceptor(httpRequestHistoryRepo));
    }
}
