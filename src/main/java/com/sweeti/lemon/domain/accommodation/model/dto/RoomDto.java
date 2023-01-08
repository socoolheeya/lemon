package com.sweeti.lemon.domain.accommodation.model.dto;


import com.sweeti.lemon.common.constant.RoomView;
import com.sweeti.lemon.domain.accommodation.model.RoomBed;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.math.BigInteger;
import java.util.List;

@Data
public class RoomDto {

    private BigInteger id;

    private String name;
    private Boolean useYn;
    private int roomCount;
    private int livingCount;
    private int bathroomCount;
    private int adultCount;
    private int childrenCount;
    private int maxOccupancy;
    private int minOccupancy;
    private Boolean isSmoking;
    private RoomView roomView;





}
