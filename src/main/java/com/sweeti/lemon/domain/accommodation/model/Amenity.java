package com.sweeti.lemon.domain.accommodation.model;

import com.sweeti.lemon.domain.common.model.BaseEntity;
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

import java.math.BigInteger;

@Getter
@Builder
@Entity
@Table(name = "amenity")
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Amenity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "amenity_id", columnDefinition = "bigint comment '편의시설ID'")
    private BigInteger id;
    @Column(name = "name", columnDefinition = "varchar(500) comment '편의시설명'")
    private String name;
    @Column(name = "type", columnDefinition = "varchar(100) comment '편의시설 타입'")
    private String type;

}
