package com.sweeti.lemon.domain.booking.model;

import com.sweeti.lemon.common.util.BooleanToYnConverter;
import com.sweeti.lemon.domain.common.model.BaseEntity;
import com.sweeti.lemon.domain.packages.model.PackageInfo;
import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigInteger;
import java.time.ZonedDateTime;

@Getter
@Builder
@Entity
@Table(name = "booking")
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Booking extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "booking_id", columnDefinition = "bigint comment '예약ID'")
    private BigInteger id;
    @Column(name = "booking_name", columnDefinition = "bigint comment '예약 객실명'")
    private String name;
    @Column(name = "booked_at", columnDefinition = "datetime comment '예약일자'")
    private ZonedDateTime bookedAt;
    @Convert(converter = BooleanToYnConverter.class)
    @Column(name = "is_fixed", columnDefinition = "varchar(1) comment '확정여부'")
    private Boolean isFixed;
    @Column(name = "check_in", columnDefinition = "datetime comment '체크인'")
    private ZonedDateTime checkIn;
    @Column(name = "check_out", columnDefinition = "datetime comment '체크아웃'")
    private ZonedDateTime checkOut;
    @Column(name = "notice", columnDefinition = "varchar(2000) comment '알림사항'")
    private String notice;
    @OneToOne(mappedBy = "booking")
    private PackageInfo packageInfo;

    @OneToOne(mappedBy = "booking")
    private BookingCancel bookingCancel;



}
