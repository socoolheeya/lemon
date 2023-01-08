package com.sweeti.lemon.domain.region.repository;

import com.sweeti.lemon.domain.region.model.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegionRepository extends JpaRepository<Region, Integer> {
}
