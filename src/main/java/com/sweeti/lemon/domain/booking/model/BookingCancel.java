package com.sweeti.lemon.domain.booking.model;

import jakarta.persistence.Column;
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
@Table(name = "booking_cancel")
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class BookingCancel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger id;
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

    @OneToOne()
    private Booking booking;


}
