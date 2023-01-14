package com.sweeti.lemon.domain.billing.model;

import com.sweeti.lemon.domain.accommodation.model.Accommodation;
import com.sweeti.lemon.domain.billing.model.http.BillingRequest;
import com.sweeti.lemon.domain.common.model.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.ConstraintMode;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.ZonedDateTime;

@Getter
@Builder
@Entity
@Table(name = "billing")
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Billing extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "billing_id", columnDefinition = "bigint not null comment '정산ID'")
    private BigInteger id;
    @Column(name = "billing_cost", columnDefinition = "decimal(20,5) comment '정산금액'")
    private BigDecimal billingCost;
    @Column(name = "billing_due_date", columnDefinition = "datetime comment '정산예정일'")
    private ZonedDateTime billingDueDate;
    @Column(name = "selling_cost", columnDefinition = "decimal(20,5) comment '판매금액'")
    private BigDecimal sellingCost;
    @Column(name = "fee", columnDefinition = "decimal(20,5) comment '수수료'")
    private BigDecimal fee;
    @Column(name = "discount_cost", columnDefinition = "decimal(20,5) comment '할인금액'")
    private BigDecimal discountCost;
    @Column(name = "additional_cost", columnDefinition = "decimal(20,5) comment '추가금액'")
    private BigDecimal additionalCost;
    @Column(name = "cancel_fee", columnDefinition = "decimal(20,5) comment '취소 수수료'")
    private BigDecimal cancelFee;
    @Column(name = "billing_additional_cost", columnDefinition = "decimal(20,5) comment '정산 추가금액'")
    private BigDecimal billingAdditionalCost;
    @Column(name = "billing_deduction_cost", columnDefinition = "decimal(20,5) comment '정산 차감금액'")
    private BigDecimal billingDeductionCost;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "accommodation_id", foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    private Accommodation accommodation;

    public static Billing toEntity(BillingRequest request) {
        return Billing.builder()
                .id(request.getId())
                .billingCost(request.getBillingCost())
                .billingDueDate(request.getBillingDueDate())
                .sellingCost(request.getSellingCost())
                .fee(request.getFee())
                .discountCost(request.getDiscountCost())
                .additionalCost(request.getAdditionalCost())
                .cancelFee(request.getCancelFee())
                .billingAdditionalCost(request.getBillingAdditionalCost())
                .billingDeductionCost(request.getBillingDeductionCost())
                .build();
    }


}
