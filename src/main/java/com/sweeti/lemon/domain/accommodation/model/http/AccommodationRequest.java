package com.sweeti.lemon.domain.accommodation.model.http;

import com.sweeti.lemon.domain.accommodation.model.Accommodation;
import com.sweeti.lemon.domain.common.model.Address;
import lombok.Getter;

import java.time.ZonedDateTime;

@Getter
public class AccommodationRequest {

    private String name;
    private String rating;
    private String chainName;
    private String brandName;
    private int roomCount;
    private int floorCount;
    private int basementCount;
    private ZonedDateTime checkIn;
    private ZonedDateTime checkOut;
    private Address address;

    public Accommodation toEntity() {
        return Accommodation.builder()
                .name(name)
                .rating(rating)
                .chainName(chainName)
                .brandName(brandName)
                .roomCount(roomCount)
                .floorCount(floorCount)
                .basementCount(basementCount)
                .checkIn(checkIn)
                .checkOut(checkOut)
                .address(address)
                .build();
    }


}
