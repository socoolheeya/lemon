package com.sweeti.lemon.domain.common.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
//import org.locationtech.jts.geom.Point;

@Getter
@Embeddable
public class Address {
    @Column(name = "address", columnDefinition = "varchar(1000) comment '주소'")
    private String address;
    @Column(name = "zip_code", columnDefinition = "varchar(100) comment '우편번호'")
    private String zipCode;
    @Column(name = "country_code", columnDefinition = "varchar(100) comment '국가 코드'")
    private String countryCode;
    @Column(name = "state_code", columnDefinition = "varchar(100) comment '주 코드'")
    private String stateCode;
    @Column(name = "city_code", columnDefinition = "varchar(100) comment '도시 코드'")
    private String cityCode;
//    @Column(name = "location", columnDefinition = "point comment '좌표 정보'")
//    private Point location;

}
