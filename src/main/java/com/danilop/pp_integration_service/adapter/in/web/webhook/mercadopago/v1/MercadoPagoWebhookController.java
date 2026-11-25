package com.danilop.pp_integration_service.adapter.in.web.webhook.mercadopago.v1;

import com.danilop.pp_integration_service.adapter.in.web.webhook.mercadopago.v1.request.PaymentDataRequest;
import com.danilop.pp_integration_service.adapter.mapper.PaymentDataMapper;
import com.danilop.pp_integration_service.application.port.in.usecase.SendPaymentQueueUseCase;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("integration-service/webhook/mercado-pago/v1")
public class MercadoPagoWebhookController {

    private final SendPaymentQueueUseCase useCase;
    private final PaymentDataMapper mapper;

    public MercadoPagoWebhookController(SendPaymentQueueUseCase useCase, PaymentDataMapper mapper) {
        this.useCase = useCase;
        this.mapper = mapper;
    }

    @PostMapping
    public ResponseEntity<?> process(@Valid PaymentDataRequest request) {
        useCase.execute(mapper.toDomain(request));
        return ResponseEntity.accepted().build();
    }
}
