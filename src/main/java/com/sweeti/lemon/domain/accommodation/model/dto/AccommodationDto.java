package com.sweeti.lemon.domain.accommodation.model.dto;

import com.querydsl.core.annotations.QueryProjection;
import com.sweeti.lemon.domain.accommodation.model.Room;
import com.sweeti.lemon.domain.common.model.Address;
import jakarta.persistence.Embedded;
import jakarta.persistence.OneToMany;
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


@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class AccommodationDto {


    private BigInteger id;

    private String name;

    private String rating;

    private String chainName;

    private String brandName;

    private int roomCount;

    private int floorCount;

    private int basementCount;

    private ZonedDateTime checkIn;

    private ZonedDateTime checkOut;
    //@Embedded
    //private Address address;
    private String address;
    @CreatedDate
    private ZonedDateTime createdAt;
    @CreatedBy
    private String createdBy;
    @LastModifiedDate
    private ZonedDateTime updatedAt;
    @LastModifiedBy
    private String updatedBy;
    @OneToMany(mappedBy = "Accommodation")
    private List<Room> rooms;

    @QueryProjection
    public AccommodationDto(BigInteger id, String name, String rating, String chainName, String brandName, int roomCount, int floorCount, int basementCount, ZonedDateTime checkIn, ZonedDateTime checkOut, String address) {
        this.id = id;
        this.name = name;
        this.rating = rating;
        this.chainName = chainName;
        this.brandName = brandName;
        this.roomCount = roomCount;
        this.floorCount = floorCount;
        this.basementCount = basementCount;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.address = address;
    }
}
