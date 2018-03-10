package com.github.dannyhn.domain;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.servlet.http.HttpServletRequest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class HttpRequestHistory extends BaseDomain {
	
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    
    private String requestUri;
    
    @Column(length=65535, columnDefinition="TEXT")
    private String parameters;
    
    public HttpRequestHistory(HttpServletRequest request) {
    	this.requestUri = request.getRequestURI();
    	this.parameters = stringifyRequestParameters(request);
    }

	private String stringifyRequestParameters(HttpServletRequest request) {
    	ObjectMapper mapper = new ObjectMapper();
		try {
			return mapper.writeValueAsString(request.getParameterMap());
		} catch (JsonProcessingException e) {
			Map<String, String[]> requestMap = request.getParameterMap();
			Map<String, List<String>> newRequestMap = new HashMap<>();
			requestMap.entrySet()
				.forEach(entry -> newRequestMap.put(entry.getKey(), Arrays.asList(entry.getValue())));
			return newRequestMap.toString();
		}
	}

}
