package com.danilop.pp_integration_service.application.domain.model;

import java.time.LocalDate;

public record PaymentData(String type, LocalDate dateCreated, Long userId, String apiVersion, String action) {
}
