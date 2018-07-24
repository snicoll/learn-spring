package br.com.mystudies.springboot.jms.activemq.topic;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import br.com.mystudies.springboot.jms.activemq.domain.Temp;

@Component
public class ConsumerTopic3 {

	
	
	
	@JmsListener(destination="temp.topic", containerFactory="topicListenerFactory")
	public void receive(Temp temp) {
		System.out.println("Recebendo no consumer 3 => " + temp);
	}
}
