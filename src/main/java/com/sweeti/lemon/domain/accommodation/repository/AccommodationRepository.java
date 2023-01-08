package com.sweeti.lemon.domain.accommodation.repository;


import com.sweeti.lemon.domain.accommodation.model.Accommodation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface AccommodationRepository extends JpaRepository<Accommodation, BigInteger> {
}
