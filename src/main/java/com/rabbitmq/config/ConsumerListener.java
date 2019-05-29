package com.rabbitmq.config;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.rabbitmq.Employee;

@Component
public class ConsumerListener {

	@RabbitListener(queues = "${amitstack.pre.rabbitmq.queue}")
	public void recieveMessage(String msg) {
		System.out.println("Message from rabbitmq queue:: " + msg);
	}

	@RabbitListener(queues = "${amitstack.comp.rabbitmq.queue}", containerFactory = "jsonConvertorFactory")
	public void recievedComplexMessage(Employee employee) {
		System.out.println("Recieved Message From RabbitMQ: " + employee);
	}

}
