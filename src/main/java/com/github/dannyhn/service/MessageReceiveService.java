package com.github.dannyhn.service;

import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Service;

import com.github.dannyhn.rabbit.library.message.RabbitMessage;

@Service
public class MessageReceiveService {
	
	@ServiceActivator(inputChannel = "mouse")	
	public void receiveMessage(RabbitMessage message) {
		System.out.println("Mouse Channel Received Message: " + message);
	}
}
