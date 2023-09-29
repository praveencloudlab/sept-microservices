package com.cts.ecart.controller;

import java.util.Map;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Controller;

@Controller
public class Receiver {
	
	
	@RabbitListener(queues = "Q1")
	public void f1(String msg) {
		System.out.println("============================");
		System.out.println("RECEIVER :: "+msg);
		System.out.println("============================");
	}
	
	@RabbitListener(queues = "Q2")
	public void f2(Map<String, Object> orderInfo) {
		System.out.println("============================");
		System.out.println("RECEIVER-ORDER :: "+orderInfo);
		System.out.println("============================");
	}
	

}
