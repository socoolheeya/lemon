package com.sweeti.lemon.domain.accommodation.repository;


import com.sweeti.lemon.domain.accommodation.model.dto.AccommodationDto;
import lombok.RequiredArgsConstructor;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

import static com.sweeti.lemon.lemon.tables.Accommodation.ACCOMMODATION;

@Repository
@RequiredArgsConstructor
public class QAccommodationRepository {

    private final DSLContext dslContext;

    public AccommodationDto getAccommodation(BigInteger id) {
        return dslContext
                .select(
                        ACCOMMODATION.ACCOMMODATION_ID
                        , ACCOMMODATION.NAME
                        , ACCOMMODATION.RATING
                        , ACCOMMODATION.CHAIN_NAME
                        , ACCOMMODATION.BRAND_NAME
                        , ACCOMMODATION.ROOM_COUNT
                        , ACCOMMODATION.FLOOR_COUNT
                        , ACCOMMODATION.BASEMENT_COUNT
                        , ACCOMMODATION.CHECK_IN
                        , ACCOMMODATION.CHECK_OUT
                        , ACCOMMODATION.ADDRESS
                )
                .from(ACCOMMODATION)
                .where(ACCOMMODATION.ACCOMMODATION_ID.eq(id.longValue()))
                .fetchInto(AccommodationDto.class)
                .stream().findFirst()
                .orElse(new AccommodationDto());
    }

    public void insertAccommodation(AccommodationDto accommodationDto) {
        dslContext.insertInto(ACCOMMODATION
                        , ACCOMMODATION.NAME
                        , ACCOMMODATION.RATING
                        , ACCOMMODATION.CHAIN_NAME
                        , ACCOMMODATION.BRAND_NAME
                        , ACCOMMODATION.ROOM_COUNT
                        , ACCOMMODATION.CHECK_IN
                        , ACCOMMODATION.CHECK_OUT
                )
                .values(
                        accommodationDto.getName()
                        , accommodationDto.getRating()
                        , accommodationDto.getChainName()
                        , accommodationDto.getBrandName()
                        , accommodationDto.getRoomCount()
                        , accommodationDto.getCheckIn()
                        , accommodationDto.getCheckOut()
                )
                .execute();
    }
}
