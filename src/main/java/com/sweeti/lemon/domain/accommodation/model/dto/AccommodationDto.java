package com.sweeti.lemon.domain.accommodation.model.dto;

import com.sweeti.lemon.domain.accommodation.model.Room;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.math.BigInteger;
import java.time.ZonedDateTime;
import java.util.List;


@Data
public class AccommodationDto {
    private BigInteger accommodationId;

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
    @OneToMany(mappedBy = "Accommodation")
    private List<Room> rooms;


    public AccommodationDto(BigInteger accommodationId, String name, String rating, String chainName, String brandName, int roomCount, int floorCount, int basementCount, ZonedDateTime checkIn, ZonedDateTime checkOut, String address) {
        this.accommodationId = accommodationId;
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
