package com.sweeti.lemon.domain.packages.repository;

import com.sweeti.lemon.domain.packages.model.PackageInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface PackageRepository extends JpaRepository<PackageInfo, BigInteger> {
}
