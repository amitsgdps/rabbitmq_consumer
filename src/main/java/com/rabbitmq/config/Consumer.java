package com.rabbitmq.config;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.rabbitmq.Employee;

@Component
public class Consumer {

	@RabbitListener(queues = "${amitstack.rabbitmq.queue}")
	public void recieveMessage(String msg) {
		System.out.println("Message from rabbitmq queue:: " + msg);
	}

	@RabbitListener(queues = "${amitstack.rabbitmq.queue}")
	public void recievedMessage(Employee employee) {
		System.out.println("Recieved Message From RabbitMQ: " + employee);
	}

}
