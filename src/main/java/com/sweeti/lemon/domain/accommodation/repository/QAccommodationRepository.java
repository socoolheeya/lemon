package com.sweeti.lemon.domain.accommodation.repository;

import com.querydsl.core.types.Expression;
import com.querydsl.core.types.dsl.Expressions;
import com.querydsl.jpa.impl.JPAQueryFactory;
import com.sweeti.lemon.domain.accommodation.model.dto.AccommodationDto;
import static com.sweeti.lemon.domain.accommodation.model.QAccommodation.accommodation;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
//@RequiredArgsConstructor
public class QAccommodationRepository {

    //private final JPAQueryFactory factory;

//    public AccommodationDto getAccommodation(BigInteger id) {
//        return factory.select(AccommodationDto.builder()
//                        .brandName(accommodation.brandName)
//                        .name(accommodation.name)
//                        .address(accommodation.address)
//                        .checkIn(accommodation.checkIn)
//                        .checkOut(accommodation.checkOut)
//                        .build()
//                )
//                .from(accommodation)
//                .where(accommodation.id.eq(Expressions.constant(id)))
//                .fetch();
//    }
}
