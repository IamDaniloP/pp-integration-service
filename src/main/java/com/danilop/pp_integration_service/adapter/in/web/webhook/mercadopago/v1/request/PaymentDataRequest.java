package com.danilop.pp_integration_service.adapter.in.web.webhook.mercadopago.v1.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record PaymentDataRequest(
        @NotBlank String type,
        @NotNull LocalDate dateCreated,
        @NotNull Long userId,
        @NotBlank String apiVersion,
        @NotBlank String action
) {
}
