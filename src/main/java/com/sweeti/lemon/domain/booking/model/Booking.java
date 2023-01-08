package com.sweeti.lemon.domain.booking.model;

import com.sweeti.lemon.common.util.BooleanToYnConverter;
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
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.math.BigInteger;
import java.time.ZonedDateTime;

@Getter
@Builder
@Entity
@Table(name = "booking")
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Booking {
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
    @OneToOne(mappedBy = "booking")
    private PackageInfo packageInfo;

    @OneToOne(mappedBy = "booking")
    private BookingCancel bookingCancel;



}
