package com.danilop.pp_integration_service.config.messaging;

import com.danilop.pp_integration_service.adapter.out.messaging.rabbitmq.PaymentsMadeProducerAdapter;
import com.danilop.pp_integration_service.application.port.out.messaging.rabbitmq.PaymentsMadeProducerPort;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.JacksonJsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    @Bean
    public MessageConverter messageConverter() {
        return new JacksonJsonMessageConverter();
    }

    @Bean
    public PaymentsMadeProducerPort createPaymentsMadeProducerPort(RabbitTemplate template) {
        return new PaymentsMadeProducerAdapter(template);
    }
}
