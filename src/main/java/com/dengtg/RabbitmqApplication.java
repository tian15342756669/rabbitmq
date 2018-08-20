package com.dengtg;

import org.springframework.amqp.core.Queue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RabbitmqApplication {

	@Bean
	public Queue helloQueue() {
		return new Queue("helloQueue");
	}

	@Bean
	public Queue testQueue(){
		return new Queue("testQueue");
	}

	@Bean
	public Queue objQueue(){
		return new Queue("object_queue");
	}

	public static void main(String[] args) {
		SpringApplication.run(RabbitmqApplication.class, args);
	}
}
