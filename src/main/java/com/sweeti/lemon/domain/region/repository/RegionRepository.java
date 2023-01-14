package com.sweeti.lemon.domain.region.repository;

import com.sweeti.lemon.domain.region.model.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface RegionRepository extends JpaRepository<Region, BigInteger> {
}
