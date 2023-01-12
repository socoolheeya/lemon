package com.sweeti.lemon.domain.packages.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class QPackageRepository {

    private final JPAQueryFactory factory;


}
