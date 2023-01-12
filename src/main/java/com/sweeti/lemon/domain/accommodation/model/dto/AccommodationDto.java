package com.sweeti.lemon.domain.accommodation.model.dto;

import com.sweeti.lemon.domain.accommodation.model.Room;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;
import java.time.ZonedDateTime;
import java.util.List;


@Data
@NoArgsConstructor
public class AccommodationDto {
    private BigInteger accommodationId;

    private String name;

    private Double rating;

    private String chainName;

    private String brandName;

    private Integer roomCount;

    private Integer floorCount;

    private Integer basementCount;

    private ZonedDateTime checkIn;

    private ZonedDateTime checkOut;
    //@Embedded
    //private Address address;
    private String address;
    @OneToMany(mappedBy = "Accommodation")
    private List<Room> rooms;


    public AccommodationDto(BigInteger accommodationId, String name, Double rating, String chainName, String brandName, Integer roomCount, Integer floorCount, Integer basementCount, ZonedDateTime checkIn, ZonedDateTime checkOut, String address) {
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
