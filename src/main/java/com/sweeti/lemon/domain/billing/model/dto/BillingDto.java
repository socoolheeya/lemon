package com.sweeti.lemon.domain.billing.model.dto;

import com.sweeti.lemon.domain.billing.model.Billing;
import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@Builder
public class BillingDto {
    private BigDecimal sellingCost;
    private BigDecimal fee;
    private BigDecimal discountCost;
    private BigDecimal additionalCost;
    private BigDecimal cancelFee;
    private BigDecimal billingAdditionalCost;
    private BigDecimal billingDeductionCost;

    public Billing toEntitiy() {
        return Billing.builder()
                .sellingCost(sellingCost)
                .fee(fee)
                .discountCost(discountCost)
                .additionalCost(additionalCost)
                .cancelFee(cancelFee)
                .billingAdditionalCost(billingAdditionalCost)
                .billingDeductionCost(billingDeductionCost)
                .build();
    }
}
