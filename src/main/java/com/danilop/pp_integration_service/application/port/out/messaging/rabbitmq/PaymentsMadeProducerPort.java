package com.danilop.pp_integration_service.application.port.out.messaging.rabbitmq;

import com.danilop.pp_integration_service.application.domain.model.PaymentData;

public interface PaymentsMadeProducerPort {
    void send(PaymentData paymentData);
}
