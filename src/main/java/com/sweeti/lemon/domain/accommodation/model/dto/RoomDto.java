package com.sweeti.lemon.domain.accommodation.model.dto;


import com.sweeti.lemon.common.constant.RoomView;
import com.sweeti.lemon.domain.accommodation.model.RoomBed;
import jakarta.persistence.OneToMany;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigInteger;
import java.util.List;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
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
    @OneToMany
    private List<RoomBed> roomBeds;





}
