package com.kvks;

import javax.jms.Queue;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
public class HelloWorldActiveMQApplication {

	public static void main(String[] args) {

		SpringApplication.run(HelloWorldActiveMQApplication.class, args);
	}

	@Bean
	public Queue notificationQueue() {
		return new ActiveMQQueue("kvks.notificationQueue");
	}

	@Bean
	public Queue greetingQueue() {
		return new ActiveMQQueue("kvks.greetingQueue");
	}

}
