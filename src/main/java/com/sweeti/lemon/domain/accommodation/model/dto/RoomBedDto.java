package com.sweeti.lemon.domain.accommodation.model.dto;

import com.querydsl.core.annotations.QueryProjection;
import lombok.Data;

@Data
public class RoomBedDto {

    private int singleBed;
    private int doubleBed;
    private int doubleSofaBed;
    private int twinBed;
    private int queenBed;
    private int queenMurphyBed;
    private int largeTwinBed;
    private int kingBed;
    private int futons;
    private int bunkBed;
    private int ondol;

    @QueryProjection
    public RoomBedDto(int singleBed, int doubleBed, int doubleSofaBed, int twinBed, int queenBed, int queenMurphyBed, int largeTwinBed, int kingBed, int futons, int bunkBed, int ondol) {
        this.singleBed = singleBed;
        this.doubleBed = doubleBed;
        this.doubleSofaBed = doubleSofaBed;
        this.twinBed = twinBed;
        this.queenBed = queenBed;
        this.queenMurphyBed = queenMurphyBed;
        this.largeTwinBed = largeTwinBed;
        this.kingBed = kingBed;
        this.futons = futons;
        this.bunkBed = bunkBed;
        this.ondol = ondol;
    }
}
