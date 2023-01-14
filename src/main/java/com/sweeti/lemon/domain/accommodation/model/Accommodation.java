package com.sweeti.lemon.domain.accommodation.model;

import com.sweeti.lemon.common.util.BooleanToYnConverter;
import com.sweeti.lemon.domain.common.model.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.ZonedDateTime;

@Entity
@Table(name = "accommodation")
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EntityListeners(AuditingEntityListener.class)
public class Accommodation extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "accommodation_id", columnDefinition = "bigint comment '시설ID'")
    private BigInteger id;
    @Column(name = "name", columnDefinition = "varchar(500) not null comment '시설명'")
    private String name;
    @Column(name = "rating", columnDefinition = "double(3,2) unsigned comment '별점점수'")
    private BigDecimal rating;
    @Column(name = "chain_name", columnDefinition = "varchar(500) comment '체인명'")
    private String chainName;
    @Column(name = "brand_name", columnDefinition = "varchar(500) comment '브랜드명'")
    private String brandName;
    @Column(name = "room_count", columnDefinition = "int unsigned comment '방 수'")
    private Integer roomCount;
    @Column(name = "floor_count", columnDefinition = "int unsigned comment '층 수'")
    private Integer floorCount;
    @Column(name = "basement_count", columnDefinition = "int unsigned comment '지하층 수'")
    private Integer basementCount;
    @Column(name = "check_in", columnDefinition = "datetime comment '체크인'")
    private ZonedDateTime checkIn;
    @Column(name = "check_out", columnDefinition = "datetime comment '체크아웃'")
    private ZonedDateTime checkOut;
//    @Embedded
//    private Address address;
    @Column(name = "address", columnDefinition = "varchar(1000) comment '주소'")
    private String address;
    @Column(name = "contact", columnDefinition = "varchar(50) comment '연락처'")
    private String contact;
    @Convert(converter = BooleanToYnConverter.class)
    @Column(name = "use_yn", columnDefinition = "char(1) default 'Y' comment '사용여부'")
    private Boolean useYn;
}
