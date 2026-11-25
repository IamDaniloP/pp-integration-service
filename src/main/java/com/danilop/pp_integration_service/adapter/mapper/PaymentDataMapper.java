package com.danilop.pp_integration_service.adapter.mapper;

import com.danilop.pp_integration_service.adapter.in.web.webhook.mercadopago.v1.request.PaymentDataRequest;
import com.danilop.pp_integration_service.application.domain.model.PaymentData;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PaymentDataMapper {
    PaymentData toDomain(PaymentDataRequest paymentDataRequest);
}
