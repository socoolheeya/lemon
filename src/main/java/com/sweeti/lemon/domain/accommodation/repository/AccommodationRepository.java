package com.sweeti.lemon.domain.accommodation.repository;


import com.sweeti.lemon.domain.accommodation.model.Accommodation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface AccommodationRepository extends JpaRepository<Accommodation, BigInteger> {
}
