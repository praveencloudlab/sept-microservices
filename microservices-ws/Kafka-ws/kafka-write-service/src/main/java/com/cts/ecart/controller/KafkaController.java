package com.cts.ecart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cts.ecart.service.KafkaProducerService;

@RestController
@RequestMapping("/api/producer")
public class KafkaController {

	@Autowired
	private KafkaProducerService kafkaProducerService;
	
	@GetMapping("/send")
	public String sendMessage(@RequestParam String topic,@RequestParam String message) {
		kafkaProducerService.sendMessage(topic, message);
		return "Message Sent!";
	}
	
	
	
}
