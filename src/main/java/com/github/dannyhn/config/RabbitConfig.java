package com.github.dannyhn.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.messaging.MessageChannel;

import com.github.dannyhn.rabbit.library.config.RabbitLibraryConfiguration;

@Configuration
@Import(RabbitLibraryConfiguration.class)
public class RabbitConfig {
	
	@Value("${rabbit.queue.name}")
	private String rabbitQueue;
	
	@Bean
	public TopicExchange steamExchange() {
		return new TopicExchange("steam-exchange");
	}
	
    @Bean
    public Binding steamExchangeBinding(TopicExchange steamExchange, 
        Queue queue) {
        return BindingBuilder.bind(queue)
            .to(steamExchange)
            .with(rabbitQueue);
    }
}
