package com.danilop.pp_integration_service.config.usecase;

import com.danilop.pp_integration_service.application.port.in.usecase.SendPaymentQueueUseCase;
import com.danilop.pp_integration_service.application.port.in.usecase.impl.SendPaymentQueueUseCaseImpl;
import com.danilop.pp_integration_service.application.port.out.messaging.rabbitmq.PaymentsMadeProducerPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfig {

    @Bean
    public SendPaymentQueueUseCase createSendPaymentQueueUseCase(PaymentsMadeProducerPort producerPort) {
        return new SendPaymentQueueUseCaseImpl(producerPort);
    }
}
