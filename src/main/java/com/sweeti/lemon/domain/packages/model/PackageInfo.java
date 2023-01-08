package com.sweeti.lemon.domain.packages.model;

import com.sweeti.lemon.common.constant.RoomStatus;
import com.sweeti.lemon.common.util.BooleanToYnConverter;
import com.sweeti.lemon.domain.accommodation.model.Accommodation;
import com.sweeti.lemon.domain.booking.model.Booking;
import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.math.BigInteger;

@Getter
@Builder
@Entity
@Table(name = "package")
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class PackageInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "package_id", columnDefinition = "bigint comment '패키지ID'")
    private BigInteger id;
    @Column(name = "name", columnDefinition = "varchar(500) comment '패키지명'")
    private String name;
    @Convert(converter = BooleanToYnConverter.class)
    @Column(name = "use_yn", columnDefinition = "char(1) comment '사용여부'")
    private Boolean useYn;
    @Column(name = "description", columnDefinition = "text comment '패키지 설명'")
    private String description;
    @Enumerated
    @Column(name = "room_status", columnDefinition = "varchar(50) comment '예약상태'")
    private RoomStatus roomStatus;
    @Column(name = "cost", columnDefinition = "decimal(20,5) comment '일반요금'")
    private BigDecimal cost;
    @Column(name = "discount_cost", columnDefinition = "decimal(20,5) comment '할인금액'")
    private BigDecimal discountCost;
    @Column(name = "total_cost", columnDefinition = "decimal(20,5) comment '총 요금'")
    private BigDecimal totalCost;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "accommodation_id")
    private Accommodation accommodation;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "booking_id")
    private Booking booking;

    @OneToOne(mappedBy = "packageInfo")
    private PackageOption packageOption;
}
