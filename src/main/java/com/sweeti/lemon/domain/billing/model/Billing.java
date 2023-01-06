package com.sweeti.lemon.domain.billing.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Entity
@Table(name = "billing")
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Billing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "billing_id", columnDefinition = "bigint not null comment '정산ID'")
    private BigInteger id;
    @Column(name = "acommodation_id", columnDefinition = "bigint not null comment '숙박시설ID'")
    private BigInteger accommodationId;
    @Column(name = "accommodation_name", columnDefinition = "varchar(500) comment '숙박시설명'")
    private String accommodationName;
    @Column(name = "billing_cost", columnDefinition = "comment '정산금액'")
    private BigDecimal billingCost;
    @Column(name = "billing_due_date", columnDefinition = "comment '정산예정일'")
    private ZonedDateTime billingDueDate;
    @Column(name = "selling_cost", columnDefinition = "comment '판매금액'")
    private BigDecimal sellingCost;
    @Column(name = "fee", columnDefinition = "comment '수수료'")
    private BigDecimal fee;
    @Column(name = "discount_cost", columnDefinition = "comment '할인금액'")
    private BigDecimal discountCost;
    @Column(name = "additional_cost", columnDefinition = "comment '추가금액'")
    private BigDecimal additionalCost;
    @Column(name = "cancel_fee", columnDefinition = "comment '취소 수수료'")
    private BigDecimal cancelFee;
    @Column(name = "billing_additional_cost", columnDefinition = "comment '정산 추가금액'")
    private BigDecimal billingAdditionalCost;
    @Column(name = "billing_deduction_cost", columnDefinition = "comment '정산 차감금액'")
    private BigDecimal billingDeductionCost;
    @CreatedDate
    @Column(name = "created_at", columnDefinition = "datetime comment '생성일'")
    private ZonedDateTime createdAt;
    @CreatedBy
    @Column(name = "careted_by", columnDefinition = "varchar(2000) comment '생성자'")
    private String createdBy;
    @LastModifiedDate
    @Column(name = "updated_at", columnDefinition = "datetime comment '수정일'")
    private ZonedDateTime updatedAt;
    @LastModifiedBy
    @Column(name = "updated_by", columnDefinition = "varchar(2000) comment '수정자'")
    private String updatedBy;


}
