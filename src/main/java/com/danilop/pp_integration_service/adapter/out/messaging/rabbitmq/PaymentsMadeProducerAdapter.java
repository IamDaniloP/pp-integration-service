package com.danilop.pp_integration_service.adapter.out.messaging.rabbitmq;

import com.danilop.pp_integration_service.application.domain.model.PaymentData;
import com.danilop.pp_integration_service.application.port.out.messaging.rabbitmq.PaymentsMadeProducerPort;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;

public class PaymentsMadeProducerAdapter implements PaymentsMadeProducerPort {

    private final RabbitTemplate template;

    @Value("${spring.rabbitmq.producer.exchange}")
    private String exchange;

    @Value("${spring.rabbitmq.producer.routing-key}")
    private String routingKey;

    public PaymentsMadeProducerAdapter(RabbitTemplate template) {
        this.template = template;
    }

    @Override
    public void send(PaymentData paymentData) {
        template.convertAndSend(exchange, routingKey, paymentData);
    }
}
