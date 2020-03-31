package br.com.SpringRabbitMqProducer.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.SpringRabbitMqProducer.Component.Producer;

@RestController
public class ProducerController {
	
	@Autowired
	private Producer producer;

	@PostMapping(value = "/send")
	public String send(@RequestBody String dto) {
		return producer.sendMsg(dto);
	}
}
