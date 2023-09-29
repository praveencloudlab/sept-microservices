package com.cts.ecart.controller;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

@Controller
public class Sender {

	@Autowired
	private RabbitTemplate rt;

	@Bean
	public Queue f1() {
		Queue q1 = new Queue("Q1", true);
		return q1;
	}
	
	@Bean
	public Queue f11() {
		Queue q2 = new Queue("Q2", true);
		return q2;
	}
	
	// send message to q1
	
	@Bean
	public void f2() {
	 rt.convertAndSend("Q1","Sixth Message from Spring");
	}
	
	@Bean
	public void f3() {
	
		Map<String, Object> data=new HashMap<String, Object>();
		data.put("ORDER_ID", "23479394733");
		data.put("ORDER_DATE", LocalDateTime.now());
		data.put("USER_ID", "Praveen");
		data.put("QTY", "3");
		data.put("PRODUCTS", Arrays.asList("P01","P02","P03"));
		
	 rt.convertAndSend("Q2",data);
	}
	
	
	
	
	

}
