package com.sweeti.lemon.domain.accommodation.model;

import com.sweeti.lemon.domain.common.model.Address;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
import java.util.List;

@Entity
@Table(name = "accommodation")
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Accommodation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "accommodation_id", columnDefinition = "bigint not null comment 'room id'")
    private BigInteger id;
    @Column(name = "bane", columnDefinition = "bigint not null comment 'room id'")
    private String name;
    @Column(name = "rating", columnDefinition = "bigint not null comment 'room id'")
    private String rating;
    @Column(name = "chain_name", columnDefinition = "bigint not null comment 'room id'")
    private String chainName;
    @Column(name = "brand_name", columnDefinition = "bigint not null comment 'room id'")
    private String brandName;
    @Column(name = "room_count", columnDefinition = "bigint not null comment 'room id'")
    private int roomCount;
    @Column(name = "floor_count", columnDefinition = "bigint not null comment 'room id'")
    private int floorCount;
    @Column(name = "basement_count", columnDefinition = "bigint not null comment 'room id'")
    private int basementCount;
    @Column(name = "check_in", columnDefinition = "bigint not null comment 'room id'")
    private ZonedDateTime checkIn;
    @Column(name = "check_out", columnDefinition = "bigint not null comment 'room id'")
    private ZonedDateTime checkOut;
    @Embedded
    private Address address;
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
    @OneToMany(mappedBy = "Accommodation")
    private List<Room> rooms;
}
