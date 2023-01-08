package com.sweeti.lemon.domain.accommodation.repository;


import com.sweeti.lemon.domain.accommodation.model.dto.AccommodationDto;
import lombok.RequiredArgsConstructor;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
@RequiredArgsConstructor
public class QAccommodationRepository {

    private final DSLContext dslContext;

//    public AccommodationDto getAccommodation(BigInteger id) {
//        return dslContext.select()
//                .from( accommodation)
//                .where(accommodation.id.eq(Expressions.constant(id)))
//                .fetch();
//    }
}
