package br.com.SpringRabbitMqProducer.Component;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Producer {

	@Autowired
	private AmqpTemplate amqpTemplate;
	
	@Value("${jsa.rabbitmq.exchange}")
	private String exchange;
	
	@Value("${jsa.rabbitmq.routingkey}")
	private String routingKey;
	
	public String sendMsg(String msg) {
		amqpTemplate.convertAndSend(exchange, routingKey, msg);
		return "Send msg = " + msg;
	}
}
