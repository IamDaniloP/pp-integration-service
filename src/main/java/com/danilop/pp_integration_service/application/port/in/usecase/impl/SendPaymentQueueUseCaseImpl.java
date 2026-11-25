package com.danilop.pp_integration_service.application.port.in.usecase.impl;

import com.danilop.pp_integration_service.application.domain.model.PaymentData;
import com.danilop.pp_integration_service.application.port.in.usecase.SendPaymentQueueUseCase;
import com.danilop.pp_integration_service.application.port.out.messaging.rabbitmq.PaymentsMadeProducerPort;

public class SendPaymentQueueUseCaseImpl implements SendPaymentQueueUseCase {

    private final PaymentsMadeProducerPort producer;

    public SendPaymentQueueUseCaseImpl(PaymentsMadeProducerPort producer) {
        this.producer = producer;
    }

    @Override
    public void execute(PaymentData paymentData) {
        //Realizar validações de auth
        producer.send(paymentData);
    }
}
