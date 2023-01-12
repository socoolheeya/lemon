package com.sweeti.lemon.domain.accommodation.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import com.sweeti.lemon.domain.accommodation.model.Accommodation;
import static com.sweeti.lemon.domain.accommodation.model.QAccommodation.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
@RequiredArgsConstructor
public class QAccommodationRepository {

    private final JPAQueryFactory factory;

    public Accommodation getAccommodation(BigInteger id) {
        return factory.selectFrom(accommodation)
                .where(accommodation.id.eq(id))
                .fetch()
                .stream().findFirst()
                .orElse(Accommodation.builder().build());
    }


}
