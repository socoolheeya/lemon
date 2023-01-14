package com.sweeti.lemon.domain.billing.model.http;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.ZonedDateTime;

@Getter
@NoArgsConstructor
public class BillingRequest {
    private BigInteger id;
    private BigDecimal billingCost;
    private ZonedDateTime billingDueDate;
    private BigDecimal sellingCost;
    private BigDecimal fee;
    private BigDecimal discountCost;
    private BigDecimal additionalCost;
    private BigDecimal cancelFee;
    private BigDecimal billingAdditionalCost;
    private BigDecimal billingDeductionCost;
}
