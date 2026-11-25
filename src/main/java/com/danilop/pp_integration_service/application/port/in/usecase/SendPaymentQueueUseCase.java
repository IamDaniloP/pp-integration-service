package com.danilop.pp_integration_service.application.port.in.usecase;

import com.danilop.pp_integration_service.application.domain.model.PaymentData;

public interface SendPaymentQueueUseCase {
    void execute(PaymentData paymentData);
}
