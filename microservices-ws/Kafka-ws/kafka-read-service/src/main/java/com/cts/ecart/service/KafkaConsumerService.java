package com.cts.ecart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {
	
	
	@KafkaListener(topics = "my-topic")
	public void readMessage(String message) {
		System.out.println("=========================");
		System.out.println(message);
		System.out.println("=========================");

	}
	

}
